/*On va pas créer la table chaque fois quand démarre l'app, on va la créer uniquement si elle n'existe pas.*/
create table if not exists users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table if not exists authorities (username varchar(50) not null,authority/*LE ROLE*/ varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index if not exists ix_auth_username on authorities (username,authority);