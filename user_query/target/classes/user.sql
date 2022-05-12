# DDL:数据库操作
use 库名; # 使用前必须执行用库操作

/* DDL:数据库表操作及DQL:数据库添加操作*/
create table 主表名(
   id int primary key auto_increment comment '主键id'
);
/*非空约束:not null
  唯一约束:unique
  检查约束:check(条件)*/
/*create table 子表名(
    id int primary key auto_increment comment '主键id',
    tid int comment '外键id',
    constraint fk foreign key (tid) references 主表名(主表主键字段名)
) comment '表描述';*/

/*建表后，修改表语法：
    alter table 表名 add/modify/change/drop/rename...*/

#insert into 表名 values (); # 插入操作

show tables ;

create table user(
    id int primary key auto_increment comment '主键id',
    name varchar(32) comment '用户名',
    sex char(1) comment '性别',
    address varchar(32) comment '用户地址',
    qq varchar(32) comment 'qq号',
    email varchar(32) comment '邮箱'
);
create table loginUser(
    id int primary key auto_increment comment '主键id',
    username varchar(32) comment '登录名',
    password varchar(32) comment '登陆密码'

);
insert into loginUser values (null,'鲁凡','123'),
                             (null,'李四','321');
insert into user values
                        (null,'鲁凡','男','南部县','1766744225','dijia2220@qq.com'),
                        (null,'李四','男','南部县','1766744225','dijia2220@qq.com'),
                        (null,'王五','男','南部县','1766744225','dijia2220@qq.com'),
                        (null,'赵六','男','南部县','1766744225','dijia2220@qq.com'),
                        (null,'鲁凡','男','南部县','1766744225','dijia2220@qq.com'),
                        (null,'鲁凡','男','南部县','1766744225','dijia2220@qq.com'),
                        (null,'鲁凡','男','南部县','1766744225','dijia2220@qq.com'),
                        (null,'鲁凡','男','南部县','1766744225','dijia2220@qq.com');

select *
from user where name='李四' or address='南部县' or email='dijia2220@qq.com';
