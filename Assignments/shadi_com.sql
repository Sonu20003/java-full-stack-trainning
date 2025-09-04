-- Database: `shadi_com`
CREATE DATABASE shadi_com;
USE shadi_com;

-- Table structure for table `Users`
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(255) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    user_role ENUM('Member', 'Administrator', 'RelationshipAdvisor') NOT NULL DEFAULT 'Member',
    account_status ENUM('PendingVerification', 'Active', 'Suspended', 'Hidden') NOT NULL DEFAULT 'PendingVerification',
    registration_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    last_login_date DATETIME,
    consent_timestamp DATETIME NOT NULL -- Records when the user agreed to ToS [16]
);


-- Table structure for table `UserProfiles`
CREATE TABLE UserProfiles (
    profile_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT UNIQUE NOT NULL,
    profile_created_for ENUM('Self', 'Son', 'Daughter', 'Sibling', 'Friend') NOT NULL, -- As per registration options [5]
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    display_name_option ENUM('FullName', 'FirstInitial', 'Custom') DEFAULT 'FirstInitial', -- Privacy option from [6]
    date_of_birth DATE NOT NULL,
    gender ENUM('Male', 'Female') NOT NULL,
    height_cm SMALLINT,
    marital_status VARCHAR(50),
    religion VARCHAR(50),
    caste VARCHAR(50),
    mother_tongue VARCHAR(50),
    country_living_in VARCHAR(100),
    state_living_in VARCHAR(100),
    city_living_in VARCHAR(100),
    education_details TEXT,
    profession_details TEXT,
    annual_income VARCHAR(100),
    about_me TEXT,
    family_details TEXT,
    horoscope_details TEXT,
    profile_completeness_score TINYINT DEFAULT 0, 
    is_verified BOOLEAN DEFAULT FALSE, 
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    INDEX (religion),
    INDEX (caste),
    INDEX (country_living_in)
);


-- Table structure for table `Photos`
CREATE TABLE Photos (
    photo_id INT PRIMARY KEY AUTO_INCREMENT,
    profile_id INT NOT NULL,
    image_url VARCHAR(255) NOT NULL,
    is_profile_picture BOOLEAN DEFAULT FALSE,
    privacy_setting ENUM('Public', 'VisibleToAccepted') NOT NULL DEFAULT 'Public', -- Photo privacy settings [6]
    upload_timestamp DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (profile_id) REFERENCES UserProfiles(profile_id) ON DELETE CASCADE
);

-- Table structure for table `PartnerPreferences`
CREATE TABLE PartnerPreferences (
    preference_id INT PRIMARY KEY AUTO_INCREMENT,
    profile_id INT UNIQUE NOT NULL,
    min_age TINYINT,
    max_age TINYINT,
    min_height_cm SMALLINT,
    max_height_cm SMALLINT,
    marital_status_preference TEXT, -- Can store a comma-separated list or JSON array
    religion_preference TEXT,
    caste_preference TEXT,
    mother_tongue_preference TEXT,
    country_preference TEXT,
    education_preference TEXT,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (profile_id) REFERENCES UserProfiles(profile_id) ON DELETE CASCADE
);

-- Table structure for table `MembershipPlans`
CREATE TABLE MembershipPlans (
    plan_id INT PRIMARY KEY AUTO_INCREMENT,
    plan_name VARCHAR(100) NOT NULL UNIQUE, -- e.g., 'Gold', 'Diamond Plus', 'Personalised VIP' [8, 12]
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    duration_days INT NOT NULL,
    is_active BOOLEAN DEFAULT TRUE -- To allow deactivating old plans
);


-- Table structure for table `UserSubscriptions`
CREATE TABLE UserSubscriptions (
    subscription_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    plan_id INT NOT NULL,
    start_date DATETIME NOT NULL,
    end_date DATETIME NOT NULL,
    status ENUM('Active', 'Expired', 'Cancelled') NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (plan_id) REFERENCES MembershipPlans(plan_id),
    INDEX (user_id),
    INDEX (end_date)
);

-- Table structure for table `Payments`

CREATE TABLE Payments (
    payment_id INT PRIMARY KEY AUTO_INCREMENT,
    subscription_id INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    payment_gateway VARCHAR(50), -- e.g., 'PayPal', 'Stripe' [17]
    transaction_id VARCHAR(255),
    payment_status ENUM('Completed', 'Pending', 'Failed') NOT NULL,
    payment_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (subscription_id) REFERENCES UserSubscriptions(subscription_id)
);

-- Table structure for table `Interests`
CREATE TABLE Interests (
    interest_id INT PRIMARY KEY AUTO_INCREMENT,
    sender_id INT NOT NULL,
    receiver_id INT NOT NULL,
    status ENUM('Pending', 'Accepted', 'Declined') NOT NULL DEFAULT 'Pending',
    sent_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    responded_at DATETIME,
    FOREIGN KEY (sender_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (receiver_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    UNIQUE (sender_id, receiver_id), -- A user can only send one interest to another
    INDEX (receiver_id, status)
);

-- Table structure for table `Messages`
CREATE TABLE Messages (
    message_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    sender_id INT NOT NULL,
    receiver_id INT NOT NULL,
    message_content TEXT NOT NULL,
    sent_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    is_read BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (sender_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (receiver_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    INDEX (sender_id, receiver_id),
    INDEX (receiver_id, is_read)
);

-- Table structure for table `ClientAssignments`
CREATE TABLE ClientAssignments (
    assignment_id INT PRIMARY KEY AUTO_INCREMENT,
    client_user_id INT NOT NULL, -- The member who purchased the personalized plan
    advisor_user_id INT NOT NULL, -- The Relationship Advisor assigned
    start_date DATE NOT NULL,
    end_date DATE,
    status ENUM('Active', 'Completed') NOT NULL DEFAULT 'Active',
    FOREIGN KEY (client_user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (advisor_user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    INDEX (advisor_user_id)
);