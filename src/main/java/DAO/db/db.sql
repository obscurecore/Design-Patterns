CREATE DATABASE phones_magazine ENCODING 'UTF-8';

--Roles.
CREATE TABLE IF NOT EXISTS roles (
  id   SERIAL PRIMARY KEY,
  role VARCHAR(5) NOT NULL
);

INSERT INTO roles (id, role) VALUES (DEFAULT, 'admin');
INSERT INTO roles (id, role) VALUES (DEFAULT, 'user');

--Users.
CREATE TABLE IF NOT EXISTS users (
  id       SERIAL PRIMARY KEY,
  login    VARCHAR(10) UNIQUE NOT NULL,
  password VARCHAR(10) UNIQUE NOT NULL,
  role     INTEGER     NOT NULL,
  FOREIGN KEY (role) REFERENCES roles (id)
);

--Add test users.
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 'admin', '123', 1);
INSERT INTO users (id, login, password, role) VALUES (DEFAULT, 'user', '1234', 2);


--get user with role.
SELECT u.id, u.login, u.password, r.id AS rol_id, r.role FROM users AS u LEFT JOIN roles AS r ON u.role = r.id WHERE u.login = (?);
--Удалить пользователя
DELETE FROM users WHERE id = (?) AND login = (?) AND password = (?) RETURNING id;
--update user
UPDATE users SET password = (?) WHERE id = (?) RETURNING id;



--phone models.
CREATE TABLE IF NOT EXISTS phone_models (
  id   SERIAL PRIMARY KEY,
  name VARCHAR(15) UNIQUE NOT NULL
);

INSERT INTO phone_models (id, name) VALUES (DEFAULT, 'samsung')
RETURNING id;

INSERT INTO phone_models (id, name) VALUES (DEFAULT, 'iphone')
RETURNING id;

INSERT INTO phone_models (id, name) VALUES (DEFAULT, 'xaomi')
RETURNING id;

INSERT INTO phone_models (id, name) VALUES (DEFAULT, 'sony')
RETURNING id;
