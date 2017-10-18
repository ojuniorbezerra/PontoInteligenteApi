CREATE TABLE role (
  id BIGSERIAL NOT NULL,
  role varchar(255) NOT NULL
);

CREATE TABLE user_security (
  id BIGSERIAL NOT NULL,
  active int NOT NULL,
  email varchar(255) NOT NULL,
  last_name varchar(255) NOT NULL,
  name varchar(255) NOT NULL,
  password varchar(255) NOT NULL
);

CREATE TABLE user_role (
  user_id int NOT NULL,
  role_id int NOT NULL
);

--
-- Indexes for table role
--
ALTER TABLE role
  ADD PRIMARY KEY (id);
--
-- Indexes for table user
--
ALTER TABLE user_security
  ADD PRIMARY KEY (id);

--
-- Constraints for dumped tables
--
--
-- Constraints for table user_role
--
ALTER TABLE user_role
  ADD CONSTRAINT FK_USER_ROLE FOREIGN KEY (user_id) REFERENCES user_security (id);
--
--
-- Constraints for table user_role
--
ALTER TABLE user_role
  ADD CONSTRAINT FK_ROLE_USER FOREIGN KEY (role_id) REFERENCES role (id);

