CREATE TABLE ticket
(ticket_no VARCHAR(10) NOT NULL,
flight_no VARCHAR(10) DEFAULT NULL,
seat_no VARCHAR(10) DEFAULT NULL);

insert into ticket values('ticket1','flight1','seat1');
insert into ticket values('ticket2','flight1','seat3');
insert into ticket values('ticket3','flight2','seat5');
insert into ticket values('ticket4','flight1','seat7');
insert into ticket values('ticket5','flight5','seat8');
insert into ticket values('ticket6','flight1','seat11');
insert into ticket values('ticket7','flight3','seat13');
insert into ticket values('ticket8','flight4','seat15');