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
	status              VARCHAR (15)        DEFAULT 'REGISTER' ,
    user_id             INT                 NOT NULL,

        CONSTRAINT fk_user
            FOREIGN KEY (user_id)
                REFERENCES user (id)

);

CREATE TABLE IF NOT EXISTS team
(
    id                  INT AUTO_INCREMENT PRIMARY KEY,
	amount              INT           NOT NULL,
	description         VARCHAR(30)
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

INSERT INTO address(city,street,build)
VALUES('lviv','torphiana','5a');

INSERT INTO user(name,surname,password,email,phone,age,address_id)
VALUES ('roman', 'kutylo', '122', 'lala@gmail.com', '3151', '15', '1');

INSERT INTO custom(kind_of_work,scope,time_of_end,user_id)
VALUES ('electric', 'big', '2h', '1');

INSERT INTO team(amount,description)
VALUES ('2','des');

-- INSERT INTO plan(custom_id,team_id,date,price)
-- VALUES ('1','1','25.02','150');
