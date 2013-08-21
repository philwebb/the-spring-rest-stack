INSERT INTO user (id, first_name, last_name, password, signup_date, username, enabled) VALUES (NEXTVAL('hibernate_sequence'), 'Clark', 'Kent', 'uberman', '2013-06-02 15:33:51', 'clarkkent', true);
INSERT INTO user (id, first_name, last_name, password, signup_date, username, enabled) VALUES (NEXTVAL('hibernate_sequence'), 'Lois', 'Lane', 'thebetterhalf', '2013-06-02 15:33:51', 'loislane', true);
INSERT INTO user (id, first_name, last_name, password, signup_date, username, enabled) VALUES (NEXTVAL('hibernate_sequence'), 'Bruce', 'Wayne', 'alfred', '2013-06-02 15:33:51', 'brucewayne', true);
INSERT INTO user (id, first_name, last_name, password, signup_date, username, enabled) VALUES (NEXTVAL('hibernate_sequence'), 'Tony', 'Stark', 'pepper', '2013-06-02 15:33:51', 'tonystark', true);
INSERT INTO user (id, first_name, last_name, password, signup_date, username, enabled) VALUES (NEXTVAL('hibernate_sequence'), 'Josh', 'Long', 'cowbell', '2013-06-02 15:33:51', 'joshlong', true);
INSERT INTO user (id, first_name, last_name, password, signup_date, username, enabled) VALUES (NEXTVAL('hibernate_sequence'), 'George', 'Jetson', 'sprockets', '2013-07-18 20:52:28', 'georgelee', true);

INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'arjen', 'poutsma', '2013-06-12 22:37:22', 3);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'mark', 'pollack', '2013-06-12 22:37:22', 4);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'david', 'syer', '2013-06-12 22:37:22', 2);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'gunnar', 'hillert', '2013-06-12 22:37:22', 5);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'rossen', 'stoyanchev', '2013-06-12 22:37:22', 5);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'josh', 'long', '2013-06-13 14:13:05', 5);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'brian', 'dussault', '2013-06-13 17:07:21', 3);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'phill', 'webb', '2013-06-26 03:54:53', 4);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'scott', 'andrews', '2013-06-28 19:11:19', 2);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'mark', 'fisher', '2013-06-28 19:54:14', 5);
INSERT INTO customer (id, first_name, last_name, signup_date, user) VALUES (NEXTVAL('hibernate_sequence'), 'josh', 'long', '2013-07-15 17:12:46', 6);
