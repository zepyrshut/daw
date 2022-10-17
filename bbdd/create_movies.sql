CREATE TABLE studio(
studio_id INT (4) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (40),
found_year INT (4),
website VARCHAR (40)
);

CREATE TABLE movie (
movie_id INT (6) PRIMARY KEY AUTO_INCREMENT, 
title VARCHAR (40),
realise_year INT (4),
genre VARCHAR (40),
duration INT (3),
studio_id INT (4),
FOREIGN KEY (studio_id) REFERENCES studio(studio_id)
);

CREATE TABLE artist(
artist_id INT(6) PRIMARY KEY AUTO_INCREMENT,
name VARCHAR (40),
born_date DATE,
death_date DATE,
country VARCHAR (40)
);

CREATE TABLE mov_art(
movie_id INT (6),
artist_id INT (6),
actor BOOLEAN,
director BOOLEAN,
PRIMARY KEY (movie_id, artist_id),
   FOREIGN KEY (movie_id) REFERENCES movie (movie_id), 
   FOREIGN KEY (artist_id) REFERENCES artist (artist_id) 
);

insert into studio(name, found_year, website) values ('Warner Bros', 1923, 'website.com');
insert into movie(title, realise_year, genre, duration, studio_id) VALUES ('Unforgiven', 1992, 'Drama', 127, 1);
insert into artist(name, born_date, country) VALUES ('Clint Eastwood', '1900-01-01', 'USA');
insert into artist(name, born_date, country) values ('Julian Ludwig', '1900-01-02', 'USA');
insert into mov_art(movie_id, artist_id, actor, director) VALUES (1, 1, false, true);
insert into mov_art(movie_id, artist_id, actor, director) VALUES (1, 2, true, false);

insert into studio(name, found_year, website) VALUES ('RFA', 1915, 'website2.com');
insert into movie (title, realise_year, genre, duration, studio_id) values ('The good, the bad and the ugly', 1945, 'Western', 200, 2);
insert into artist (name, born_date, death_date, country) value ('Lee Van Cleef', '1900-02-02', '1950-01-01', 'Italy');
insert into artist (name, born_date, death_date, country) VALUES ('Sergio Leone', '1929-01-03', '1983-04-30', 'Italy');
insert into mov_art(movie_id, artist_id, actor, director) VALUES (2, 1, true, false);
insert into mov_art(movie_id, artist_id, actor, director) VALUES (2, 2, true, false);
insert into mov_art(movie_id, artist_id, actor, director) VALUES (2, 3, false, true);
