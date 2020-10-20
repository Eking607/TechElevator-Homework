CREATE TABLE employee(

        employee_number SERIAL PRIMARY KEY,
        job_title VARCHAR (40) NOT NULL,
        last_name VARCHAR (30) NOT NULL,
        first_name VARCHAR (20) NOT NULL,
        gender CHAR (1) NOT NULL,
        date_of_birth DATE NOT NULL,
        date_of_hire DATE NOT NULL,
       
       CONSTRAINT check_gender CHECK (gender = 'M' or gender = 'F')
      
);


CREATE TABLE department (
        
        department_id SERIAL PRIMARY KEY,
        department_name VARCHAR (30) NOT NULL
      
);


CREATE TABLE project (

        project_number SERIAL PRIMARY KEY,
        project_name VARCHAR (30) NOT NULL,
        start_date DATE NOT NULL
        
 );
 
 CREATE TABLE employee_project (
 
        employee_number INTEGER, 
        project_number INTEGER,
        
        CONSTRAINT fk_employee_number FOREIGN KEY (employee_number) REFERENCES employee (employee_number),
        CONSTRAINT fk_project_number FOREIGN KEY (project_number) REFERENCES project (project_number)
 
 );

 
ALTER TABLE employee ADD COLUMN department_id INTEGER;

ALTER TABLE employee ADD CONSTRAINT fk_employee_department FOREIGN KEY (department_id) REFERENCES department(department_id);


INSERT INTO department(department_name)
VALUES               ('Player');
INSERT INTO department(department_name)
VALUES               ('Coaching');
INSERT INTO department(department_name)
VALUES               ('Official');
INSERT INTO department(department_name)
VALUES               ('Announcing');

INSERT INTO project (project_name, start_date)
VALUES              ('Beat Ravens', '11-01-2020');
INSERT INTO project (project_name, start_date)
VALUES              ('Throw Flags', '11-17-2020');
INSERT INTO project (project_name, start_date)
VALUES              ('Talk the Talk', '12-25-2020');
INSERT INTO project (project_name, start_date)
VALUES              ('Practice', '10-28-2020');

INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Quarterback', 'Roethlisberger', 'Ben', 'M', '03-02-1982', '04-24-2004', '1');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Wide Receiver', 'Claypool', 'Chase', 'M', '04-25-2020', '04-24-2004', '1');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Wide Receiver', 'Smith-Schuster', 'Juju', 'M', '11-22-1996', '04-27-2017', '1');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Running Back', 'Conner', 'James', 'M', '05-05-1995', '04-28-2017', '1');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Head Coach', 'Tomlin', 'Mike', 'M', '03-17-1972', '01-22-2007', '2');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Referee', 'Boger', 'Jerome', 'M', '07-01-1995', '10-08-2006', '3');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Referee', 'Thomas', 'Sarah', 'F', '09-27-1973', '04-08-2015', '3');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Commentator', 'Tafoya', 'Michele', 'F', '12-17-1964', '09-24-2009', '4');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Commentator', 'Colinsworth', 'Chris', 'M', '01-27-1969', '08-24-2000', '4');
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id)
VALUES               ('Coach', 'Mitchell', 'John', 'M', '10-14-1941', '09-21-2007', '2');


INSERT INTO employee_project (employee_number, project_number)
VALUES                       (1, 1);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (2, 1);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (3, 1);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (4, 1);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (5, 3);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (6, 2);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (7, 2);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (8, 4);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (9, 3);
INSERT INTO employee_project (employee_number, project_number)
VALUES                       (10, 4);
