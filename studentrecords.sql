DROP TABLE IF EXISTS gen_inf;
DROP TABLE IF EXISTS clearance_checklist;
DROP TABLE IF EXISTS unclaim_documents;

CREATE TABLE gen_inf (
	stud_id VARCHAR(50),
	course VARCHAR(100) NOT NULL,
	surname VARCHAR(100) NOT NULL,
	firstname VARCHAR(100) NOT NULL,
	middlename VARCHAR(100) NOT NULL,
	sex VARCHAR(8) NOT NULL,
	bday VARCHAR(15) NOT NULL,
	address VARCHAR(255) NOT NULL,
	PRIMARY KEY (stud_id)
);

CREATE TABLE clearance_checklist (
	id INTEGER AUTO_INCREMENT,
	stud_id VARCHAR(50),
	department VARCHAR(255) NOT NULL,
	remarks VARCHAR(255) NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (stud_id) REFERENCES gen_inf(stud_id)
);

CREATE TABLE unclaim_documents (
	id INTEGER AUTO_INCREMENT,
	stud_id VARCHAR(50),
	req_doc VARCHAR(255) NOT NULL,
	date_req VARCHAR(255) NOT NULL,
	remarks VARCHAR(255),
	PRIMARY KEY (id),
	FOREIGN KEY (stud_id) REFERENCES gen_inf(stud_id)
);

CREATE TABLE students_login (
	id INTEGER AUTO_INCREMENT,
	stud_id VARCHAR(50),
	pword VARCHAR(255) NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (stud_id) REFERENCES gen_inf(stud_id)
);



INSERT INTO gen_inf (stud_id, course, surname, firstname, middlename, sex, bday, address) VALUES (
	'GS-1617-0005', 'MBA', 'Manso', 'Ma. Christina', 'Travinio', 'F', '05/10/88', 'Malolos City, Bulacan');
INSERT INTO gen_inf (stud_id, course, surname, firstname, middlename, sex, bday, address) VALUES (
	'COL-1415-0001', 'BSIT', 'Albuera', 'Chibi Maruko', 'Cruz', 'F', '06/01/90', 'Bulakan, Bulacan');
INSERT INTO gen_inf (stud_id, course, surname, firstname, middlename, sex, bday, address) VALUES (
	'BED-1516-0003', 'Grade 11', 'Espiritu', 'Harold', 'Gomez', 'M', '11/22/00', 'Bulakan, Bulacan');
INSERT INTO gen_inf (stud_id, course, surname, firstname, middlename, sex, bday, address) VALUES (
	'COL-1415-0002', 'BLIS', 'Tarranza', 'Cynthia', 'Gomez', 'F', '09/06/98', 'Guiguinto, Bulacan');

INSERT INTO clearance_checklist (stud_id, department, remarks) VALUES (
	'COL-1415-0001', 'finance', '5000');
INSERT INTO clearance_checklist (stud_id, department, remarks) VALUES (
	'COL-1415-0002', 'cleared' ,'cleared');
INSERT INTO clearance_checklist (stud_id, department, remarks) VALUES (
	'BED-1516-0003', 'library', 'book');
INSERT INTO clearance_checklist (stud_id, department, remarks) VALUES (
	'GS-1617-0005', 'cleared' ,'cleared');

INSERT INTO unclaim_documents (stud_id, req_doc, date_req, remarks) VALUES (
	'COL-1415-0002', 'TOR' ,'01/15/18', 'paid');
INSERT INTO unclaim_documents (stud_id, req_doc, date_req, remarks) VALUES (
	'GS-1617-0005', 'Cert of Units Earned' ,'01/15/18', 'paid');

INSERT INTO students_login (stud_id, pword) VALUES (
	'COL-1415-0002', 'jes');
INSERT INTO students_login (stud_id, pword) VALUES (
	'GS-1617-0005', 'jecelyn');
