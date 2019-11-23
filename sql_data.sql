USE marshuber;

INSERT INTO route (name) VALUES ('Minsk-Babruisk');
INSERT INTO route (name) VALUES ('Babruisk-Minsk');

INSERT INTO driver (name, phone, car_number, route_id) VALUES ('Alex', '291112231', '1236EE7', '1');
INSERT INTO driver (name, phone, car_number, route_id) VALUES ('Dmitry', '291112216', '1236EE7', '2');
INSERT INTO driver (name, phone, car_number, route_id) VALUES ('Sergei', '291112136', '1236EE7', '1');

INSERT INTO rider (name, phone, route_id) VALUES ('Terminator3', '291552136', '1');
INSERT INTO rider (name, phone, route_id) VALUES ('Terminator3', '291112536', '1');
INSERT INTO rider (name, phone, route_id) VALUES ('Terminator3', '296612136', '2');