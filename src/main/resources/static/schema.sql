CREATE TABLE IF NOT EXISTS address
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    city      VARCHAR (30) NOT NULL,
    street    VARCHAR (30) NOT NULL,
    build     VARCHAR (30) NOT NULL
);


CREATE TABLE IF NOT EXISTS user
(
    id                     INT AUTO_INCREMENT PRIMARY KEY,
    name                   VARCHAR(20)        NOT NULL,
    surname                VARCHAR(20)        NOT NULL,
    password               VARCHAR(30)        NOT NULL,
    email                  VARCHAR(30)        NOT NULL,
    phone                  VARCHAR(11),
    age                    INT                NOT NULL,
    address_id             INT                NOT NULL,

    CONSTRAINT fk_address
        FOREIGN KEY (address_id)
            REFERENCES address (id)
);


CREATE TABLE IF NOT EXISTS custom
(
    id                  INT AUTO_INCREMENT PRIMARY KEY,
	kind_of_work        VARCHAR(20)         NOT NULL,
	scope               VARCHAR (20)        NOT NULL,
	time_of_end         VARCHAR(20)         NOT NULL,
	status              VARCHAR (10)        NOT NULL,
    user_id             INT                 NOT NULL,

        CONSTRAINT fk_user
            FOREIGN KEY (user_id)
                REFERENCES user (id)

);

CREATE TABLE IF NOT EXISTS team
(
    id                  INT AUTO_INCREMENT PRIMARY KEY,
	amount              INT           NOT NULL
);

CREATE TABLE IF NOT EXISTS plan
(
    id                  INT AUTO_INCREMENT PRIMARY KEY,
	custom_id           INT NOT NULL,
	team_id             INT NOT NULL,
	date                VARCHAR (10) NOT NULL,
	price               INT,

	CONSTRAINT fk_custom
	    FOREIGN KEY (custom_id)
	        REFERENCES custom(id),

	CONSTRAINT fk_team
	    FOREIGN KEY (team_id)
	        REFERENCES team(id)
);