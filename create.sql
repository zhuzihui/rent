create database spring_rent;


--用户表
create table USERS
(
  U_ID        int primary key auto_increment,        
  U_NAME      VARCHAR(50),          
  U_PASSWORD  VARCHAR(50),          
  U_TELEPHONE VARCHAR(15),        
  U_USERNAME  VARCHAR(50),          
  U_ISADMIN   VARCHAR(5)    	         
);--是否管理员
select * from users;
delete from users where u_name=1

drop table USERS

--地区表
create table DISTRICT
(
  D_ID   int primary key,          
  D_NAME VARCHAR(50) 
);
--街道表
create table STREET
(
  S_ID        int primary key,      
  S_NAME        VARCHAR(50),        
  D_ID int               
);


--房屋类型表
create table housetype
(
  HT_ID    int primary key auto_increment,            
  HT_NAME VARCHAR(20) 
)
--房屋信息表
create table HOUSE
(
  H_ID          int primary key auto_increment,                
  U_ID     int,          --用户ID号   	
  HT_ID     int,              --类型ID号   
  H_TITLE       NVARCHAR(50), --标题         
  H_DESCRIPTION text,     	--户型
  H_PRICE       double,     --价格           
  H_PUBDATE     DATE,       --发布日期           
  H_FLOORAGE    int,        --面积         
  H_CONTENT     VARCHAR(100), --发布内容       
  S_ID   int               	--街道ID  
);
insert into house(U_ID,HT_ID,H_TITLE,H_DESCRIPTION,H_PRICE,H_PUBDATE,H_FLOORAGE,H_CONTENT,S_ID)
	values(1,1,'SS',1,520.0,now(),120,'SS级住房',1)
select * from house;
select count(*) from house
select * from house limit 2,4
--					limit start(:page*pagesize),pagesize

delete from house;
