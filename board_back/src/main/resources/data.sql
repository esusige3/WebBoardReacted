insert into user(account, password, username, email)
values('user2','1234','test2','user2@dgsw.hs.kr'),
      ('user3','1234','test3','user3@dgsw.hs.kr'),
      ('user4','1234','test4','user4@dgsw.hs.kr'),
      ('user5','1234','test5','user5@dgsw.hs.kr'),
      ('user6','1234','test6','user6@dgsw.hs.kr');

insert  into post(user_id, title, content)
values
(1,'title 1', 'content content 1'),
(1,'title 2', 'content content 2'),
(2,'title 3', 'content content 3'),
(3,'title 4', 'content content 4');
