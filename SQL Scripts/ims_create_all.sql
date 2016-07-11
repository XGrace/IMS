--Create user and grant privileges--
create user ims_admin
identified by p4ssw0rd
default tablespace users
temporary tablespace temp
quota 10M on users;
--
grant connect to ims_admin;
grant resource to ims_admin;
grant create session to ims_admin;
grant create table to ims_admin;
grant create view to ims_admin;
--
conn ims_admin/p4ssw0rd;
-- Create and populate tables---
create table ims_state_abbrv(
  abbrv_id number not null,
  state_name varchar2(15) not null,
  state_abbrv varchar2(2) not null,
  constraint isa_pk primary key (abbrv_id)
);
--
create sequence ims_state_abbrv_seq
start with 1
increment by 1;
--
create or replace trigger ims_state_abbrv_trigger
before insert on ims_state_abbrv
for each row
begin
  select ims_state_abbrv_seq.nextval into :new.abbrv_id from dual;
end;
/
--
insert all 
  into ims_state_abbrv(state_name, state_abbrv) values ('Alabama', 'AL')
  into ims_state_abbrv(state_name, state_abbrv) values ('Alaska', 'AK')
  into ims_state_abbrv(state_name, state_abbrv) values ('Arizona', 'AZ')
  into ims_state_abbrv(state_name, state_abbrv) values ('Arkansas', 'AR')
  into ims_state_abbrv(state_name, state_abbrv) values ('California', 'CA')
  into ims_state_abbrv(state_name, state_abbrv) values ('Colorado', 'CO')
  into ims_state_abbrv(state_name, state_abbrv) values ('Connecticut', 'CT')
  into ims_state_abbrv(state_name, state_abbrv) values ('Delaware', 'DE')
  into ims_state_abbrv(state_name, state_abbrv) values ('Florida', 'FL')
  into ims_state_abbrv(state_name, state_abbrv) values ('Georgia', 'GA')
  into ims_state_abbrv(state_name, state_abbrv) values ('Hawaii', 'HI')
  into ims_state_abbrv(state_name, state_abbrv) values ('Idaho', 'ID')
  into ims_state_abbrv(state_name, state_abbrv) values ('Illinois', 'IL')
  into ims_state_abbrv(state_name, state_abbrv) values ('Indiana', 'IN')
  into ims_state_abbrv(state_name, state_abbrv) values ('Iowa', 'IA')
  into ims_state_abbrv(state_name, state_abbrv) values ('Kansas', 'KS')
  into ims_state_abbrv(state_name, state_abbrv) values ('Kentucky', 'KY')
  into ims_state_abbrv(state_name, state_abbrv) values ('Louisiana', 'LA')
  into ims_state_abbrv(state_name, state_abbrv) values ('Maine', 'ME')
  into ims_state_abbrv(state_name, state_abbrv) values ('Maryland', 'MD')
  into ims_state_abbrv(state_name, state_abbrv) values ('Massachusetts', 'MA')
  into ims_state_abbrv(state_name, state_abbrv) values ('Michigan', 'MI')
  into ims_state_abbrv(state_name, state_abbrv) values ('Minnesota', 'MN')
  into ims_state_abbrv(state_name, state_abbrv) values ('Mississippi', 'MS')
  into ims_state_abbrv(state_name, state_abbrv) values ('Missouri', 'MO')
  into ims_state_abbrv(state_name, state_abbrv) values ('Montana', 'MT')
  into ims_state_abbrv(state_name, state_abbrv) values ('Nebraska', 'NE')
  into ims_state_abbrv(state_name, state_abbrv) values ('Nevada', 'NV')
  into ims_state_abbrv(state_name, state_abbrv) values ('New Hampshire', 'NH')
  into ims_state_abbrv(state_name, state_abbrv) values ('New Jersey', 'NJ')
  into ims_state_abbrv(state_name, state_abbrv) values ('New Mexico', 'NM')
  into ims_state_abbrv(state_name, state_abbrv) values ('New York', 'NY')
  into ims_state_abbrv(state_name, state_abbrv) values ('North Carolina', 'NC')
  into ims_state_abbrv(state_name, state_abbrv) values ('North Dakota', 'ND')
  into ims_state_abbrv(state_name, state_abbrv) values ('Ohio', 'OH')
  into ims_state_abbrv(state_name, state_abbrv) values ('Oklahoma', 'OK')
  into ims_state_abbrv(state_name, state_abbrv) values ('Oregon', 'OR')
  into ims_state_abbrv(state_name, state_abbrv) values ('Pennsylvania', 'PA')
  into ims_state_abbrv(state_name, state_abbrv) values ('Rhode Island', 'RI')
  into ims_state_abbrv(state_name, state_abbrv) values ('South Carolina', 'SC')
  into ims_state_abbrv(state_name, state_abbrv) values ('South Dakota', 'SD')
  into ims_state_abbrv(state_name, state_abbrv) values ('Tennessee', 'TN')
  into ims_state_abbrv(state_name, state_abbrv) values ('Texas', 'TX')
  into ims_state_abbrv(state_name, state_abbrv) values ('Utah', 'UT')
  into ims_state_abbrv(state_name, state_abbrv) values ('Vermont', 'VT')
  into ims_state_abbrv(state_name, state_abbrv) values ('Virginia', 'VA')
  into ims_state_abbrv(state_name, state_abbrv) values ('Washington', 'WA')
  into ims_state_abbrv(state_name, state_abbrv) values ('West Virginia', 'WV')
  into ims_state_abbrv(state_name, state_abbrv) values ('Wisconsin', 'WI')
  into ims_state_abbrv(state_name, state_abbrv) values ('Wyoming', 'WY')
select * from dual;
--

create table ims_client_type(
  client_type_id number,
  client_type varchar2(25) not null,
  constraint ict_pk primary key (client_type_id)
);
--
create sequence ims_client_type_seq
start with 1
increment by 1;
--
create or replace trigger ims_client_type_trigger
before insert on ims_client_type
for each row
begin
  select ims_client_type_seq.nextval into :new.client_type_id from dual;
end;
/
--
insert into ims_client_type(client_type) values('Supplier');
insert into ims_client_type(client_type) values('Retailer');
--

create table ims_product_category(
  category_id number,
  category_description varchar2(50) not null,
  constraint ipc_pk primary key(category_id)
);
--
create sequence ims_product_category_seq
start with 1
increment by 1;
--
create or replace trigger ims_product_category_trigger
before insert on ims_product_category
for each row
begin
  select ims_product_category_seq.nextval into :new.category_id from dual;
end;
/
--
insert all
  into ims_product_category(category_description) values('CPU')
  into ims_product_category(category_description) values('Graphics Card')
  into ims_product_category(category_description) values('Motherboard')
  into ims_product_category(category_description) values('Hard Drive')
  into ims_product_category(category_description) values('SSD')
  into ims_product_category(category_description) values('RAM')
  into ims_product_category(category_description) values('Power Supply')
  into ims_product_category(category_description) values('Mouse')
  into ims_product_category(category_description) values('Keyboard')
  into ims_product_category(category_description) values('Monitor')
select * from dual;
--

create table ims_product(
  product_upc number,
  product_name varchar2(60) not null,
  product_description varchar2(150) not null,
  short_name varchar2(30) not null,
  unit_cost number not null,
  pack_size varchar2(10) not null,
  reorder_quantity number not null,
  retail_price number not null,
  product_weight number,
  product_image varchar2(30),
  constraint prod_pk primary key (product_upc)
);
--
create sequence ims_product_seq
start with 1
increment by 1;
--
create or replace trigger ims_product_trigger
before insert on ims_product
for each row
begin
  select ims_product_seq.nextval into :new.product_upc from dual;
end;
/
--
insert all
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Intel Core i7 4790k', 'Intel Core i7 4790k Quad Core 4.0 GHz LGA 1150 Desktop Processor',
                'i7 4790k', 300.99, 'XS', 15, 339.99, 0.7, 'i74790k.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('AMD FX-8350 Black Edition Vishera', 'AMD FX-8350 Black Edition Vishera 8-Core 4.0 GHz(4.2 GHz Turbo)',
               'AMD FX-8350', 120.00, 'XS', 10, 159.99, 0.7, '8350black.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Intel Pentium G3258 Haswell', 'Intel Pentium G3258 Haswell Dual-Core 3.2 GHz LGA 1150 53W',
               'Pentium G3258', 49.99, 'XS', 8, 69.99, 0.7, 'g3258.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('EVGA Geforce GTX 970', 'EVGA Geforce GTX 970 4GB FTW Gaming w/ACX 2.0+ Whisper Silent Cooling',
               'EVGA GTX 970', 329.99, 'S', 8, 405.99, 2.2, 'gtx970.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('MSI Geforce GTX 1080', 'MSI Geforce GTX 1080 DirectX12 8GB OC 256-bit GDDR5X PCI Express 3.0',
               'MSI GTX 1080', 529.99, 'S', 10, 659.99, 2.2, 'gtx1080.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Sapphire Nitro Radeon R9 390X', 'Sapphire Nitro Radeon R9 390X DirectX 12 8GB 512-bit GDDR5 PCI Express 3.0',
               'Sapphire R9 390X', 509.99, 'S', 5, 599.99, 2.2, 'r9390x.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('ASUS ROG 1151 Intel Z170', 'ASUS ROG 1151 Intel Z170 LGA 1151 HDMI SATA 6Gb/s USB 3.1 ATX Intel',
               'ASUS ROG Intel Z170', 149.99, 'M', 5, 214.99, 3.1, 'AsusROG1151.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('ASUS H971-Plus Intel H97', 'ASUS H971-Plus Intel H97 LGA 1150 HDMI SATA 6Gb/s USB 3.0 Mini ITX',
               'ASUS H971-Plus', 69.99, 'M', 5, 99.00, 3.1, 'AsusH971.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('MSI X99A Intel X99 Godlike Gaming Carbon', 'MSI X99A Intel X99 Godlike Gaming Carbon LGA 2011-v3 SATA 6Gb/s USB 3.1',
               'MSI X99A', 399.99, 'M', 5, 549.99, 3.3, 'MSIX99A.jpg')
   into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('WD Blue 1TB Desktop Hard Disk Drive', 'WD Blue 1TB Desktop Hard Disk Drive 7200 RPM SATA 6Gb/s 64MB Cache 3.5 Inch',
               'WD Blue 1TB Desktop', 29.99, 'S', 5, 49.99, 3.5, 'WDBlue1TB.jpg')
   into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('WD Black 1TB Performance Desktop Hard Disk Drive', 'WD Black 1TB Performance Desktop Hard Disk Drive 7200 RPM SATA 6Gb/s 64MB Cache 3.5 Inch',
               'WD Black 1TB Desktop', 49.99, 'S', 5, 69.99, 3.5, 'WDBlack1TB.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('WD VelociRaptor 500GB', 'WD VelociRaptor 500GB 10000 RPM 64MB Cache SATA 6.0 Gb/s 3.5 Inch HDD',
               'WD VelociRaptor 500GB', 149.99, 'S', 5, 209.89, 3.5, 'WDVel500GB.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Samsung 850 EVO 2.5" 500GB', 'Samsung 850 EVO 2.5" 500GB SATA III 3-D Vertical Internal Solid State Drive',
               'Samsung 850 EVO 500GB', 119.99, 'S', 8, 154.99, 1.7, 'Samsung850EVO.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Samsung 850 EVO 2.5" 250GB', 'Samsung 850 EVO 2.5" 250GB SATA III 3-D Vertical Internal Solid State Drive',
               'Samsung 850 EVO 250GB', 79.99, 'S', 8, 92.00, 1.7, 'Samsung850EVO.jpg') 
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Kingston SSDNow V300 2.5" 240GB', 'Kingston SSDNow V300 2.5" 240GB SATA III Internal Solid State Drive',
               'Kingston V300 240GB', 45.00, 'S', 6, 63.00, 1.7, 'Kingston240GB.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('G.SKILL Ripjaws X Series 8GB (2 X 4GB)', 'G.SKILL Ripjaws X Series 8GB (2 X 4GB) 240-Pin DDR3 SDRAM 2133(PC3 17000) Desktop Memory',
               'G.S Ripjaws 8GB (2 x 4GB)', 30.00, 'XS', 5, 44.99, 0.8, 'GSKILL8GB(2X4GB).jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('CORSAIR Vengeance Pro 8GB (2 X 4GB)', 'CORSAIR Vengeance Pro 8GB (2 X 4GB) 240-Pin DDR3 SDRAM 2400(PC3 19200) Desktop Memory',
               'CORSAIR V.Pro 8GB (2 X 4GB)', 29.99, 'S', 5, 41.99, 0.8, 'CORSAIRVP8GB(2X4GB).jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('G.SKILL Ripjaws V Series 16GB (2 X 8GB)', 'G.SKILL Ripjaws V Series 16GB (2 X 8GB) 288-Pin DDR4 SDRAM 3200 Intel Z170 Platform Desktop Memory',
               'G.S RJ VS 16GB (2 X 8GB)', 52.99, 'S', 5, 72.99, 0.8, 'GSKILLRVS16GB(2X8GB).jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('EVGA 220-G2-0850-XR 80 PLUS GOLD 850W', 'EVGA 220-G2-0850-XR 80 PLUS GOLD 850W ECO Mode NVIDIA SLI Ready and Crossfire Support Continuous Power Supply',
               'EVGA 220 80+ Gold 850W', 89.99, 'M', 6, 119.99, 6.8, 'EVGA220XR80P850W.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('EVGA 220-P2-1000-XR 80 PLUS Platinum 1000 W', 'EVGA 220-P2-1000-XR 80 PLUS Platinum 1000 W 10 yr Warranty ECO Mode NVIDIA SLI Ready and Crossfire Support Power Supply',
               'EVGA 220 80+ Plat 1000W',129.99, 'M', 5, 179.99, 6.8, 'EVGA22080PP1000W.jpg') 
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Thermaltake Smart Series 700W SLI', 'Thermaltake Smart Series 700W SLI / CrossFire Ready Continuous Power ATX12V V2.3 / EPS12V 80 PLUS Certified Active PFC Power Supply',
               'Thermaltake SS 700W SLI', 39.99, 'M', 5, 59.99, 6.8, 'ThermaltakeSS700W.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('SteelSeries Rival Optical Gaming Mouse', 'SteelSeries Rival Optical Gaming Mouse',
               'SteelSeries Rival', 39.99, 'S', 4, 60.00, 1.1, 'SteelSeriesRival.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('RAZER DeathAdder Chroma USB Gaming Mouse', 'RAZER DeathAdder Chroma USB Gaming Mouse',
               'RAZER DeathAdder Chroma', 43.99, 'S', 5, 69.99, 1.1, 'RazerDAChroma.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Logitech G300S Gaming Mouse', 'Logitech G300S Black 9 Buttons 1 x Wheel USB Wired Optical 2500 dpi Gaming',
               'Logitech G300S', 19.99, 'S', 4, 29.99, 1.1, 'LogitechG300S.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Perixx PX-1100 Backlit Gaming Keyboard', 'Perixx PX-1100 Backlit Gaming Keyboard - Red/Blue/Purple Illuminated Keys',
               'Perixx PX-1100 Keyboard', 29.99, 'M', 4, 49.99, 0.7, 'PerixxPX1100.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Corsair Vengeance K65 Compact Mechanical Gaming Keyboard', 'Corsair Vengeance K65 Compact Mechanical Gaming Keyboard - Cherry MX Red Switches',
               'Corsair V. K65 Keyboard', 59.99, 'M', 4, 87.99, 0.7, 'CorsairVK65.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Logitech G710 Mechanical USB Gaming Keyboard', 'Logitech G710 Mechanical USB Gaming Keyboard',
               'Logitech G710 Keyboard', 88.99, 'M', 4, 114.99, 0.8, 'LogitechG710.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Acer Predator 24" 1ms 1920x1080 Gaming Monitor', 'Acer Predator XB241H Bmipr 24" 1ms 1920x1080 Gaming Monitor G-Sync HDMI 350 cd/m2 1,000:1 Built-in Speakers',
               'Acer Predator 24" Monitor', 309.99, 'M', 3, 394.99, 15.5, 'AcerPredator24.jpg')
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('ASUS ROG PG278Q Black 27" WQHD 2560 x 1440', 'ASUS ROG PG278Q Black 27" WQHD 2560 x 1440, 144 Hz 1ms (GTG) NVIDIA G-Sync Gaming Monitor',
               'ASUS ROG 27" 144Hz 1ms Monitor', 499.99, 'L', 5, 669.99, 17.5, 'ASUSROGPG278Q.jpg') 
  into ims_product(PRODUCT_NAME,PRODUCT_DESCRIPTION,SHORT_NAME,UNIT_COST,
                   PACK_SIZE,REORDER_QUANTITY,RETAIL_PRICE,PRODUCT_WEIGHT,PRODUCT_IMAGE) 
       values ('Acer XB270H Abprz Black 27" 1ms Monitor', 'Acer XB270H Abprz Black 27" 1ms (GTG) 144HZ Widescreen LED Backlight LCD G-SYNC Monitor, 300 cd/m2, USB Hub, 1000:1',
               'Acer XB270H 27" 1ms Monitor', 479.99, 'L', 4, 595.99, 17.1, 'AcerXB270H.jpg')
select * from dual;  

--
create table product_categories(
  product_upc number,
  category_id number,
  constraint pc_pk primary key (product_upc, category_id),
  constraint product_upc_fk foreign key (product_upc) references ims_product(product_upc),
  constraint category_id_fk foreign key (category_id) references ims_product_category(category_id)
);
--
insert all
  into product_categories(product_upc, category_id) values(1,1)
  into product_categories(product_upc, category_id) values(2,1)
  into product_categories(product_upc, category_id) values(3,1)
  into product_categories(product_upc, category_id) values(4,2)
  into product_categories(product_upc, category_id) values(5,2)
  into product_categories(product_upc, category_id) values(6,2)
  into product_categories(product_upc, category_id) values(7,3)
  into product_categories(product_upc, category_id) values(8,3)
  into product_categories(product_upc, category_id) values(9,3)
  into product_categories(product_upc, category_id) values(10,4)
  into product_categories(product_upc, category_id) values(11,4)
  into product_categories(product_upc, category_id) values(12,4)
  into product_categories(product_upc, category_id) values(13,5)
  into product_categories(product_upc, category_id) values(14,5)
  into product_categories(product_upc, category_id) values(15,5)
  into product_categories(product_upc, category_id) values(16,6)
  into product_categories(product_upc, category_id) values(17,6)
  into product_categories(product_upc, category_id) values(18,6)
  into product_categories(product_upc, category_id) values(19,7)
  into product_categories(product_upc, category_id) values(20,7)
  into product_categories(product_upc, category_id) values(21,7)
  into product_categories(product_upc, category_id) values(22,8)
  into product_categories(product_upc, category_id) values(23,8)
  into product_categories(product_upc, category_id) values(24,8)
  into product_categories(product_upc, category_id) values(25,9)
  into product_categories(product_upc, category_id) values(26,9)
  into product_categories(product_upc, category_id) values(27,9)
  into product_categories(product_upc, category_id) values(28,10)
  into product_categories(product_upc, category_id) values(29,10)
  into product_categories(product_upc, category_id) values(30,10)
select * from dual;
--

create table ims_address(
  ims_address_id number,
  street_address_1 varchar2(150) not null,
  street_address_2 varchar2(50),
  address_city varchar2(35) not null,
  state_id number not null,
  address_zip varchar(10) not null,
  constraint ims_address_pk primary key(ims_address_id),
  constraint state_abbrv_fk foreign key(state_id) references ims_state_abbrv (abbrv_id)
);
--
create sequence ims_address_seq
start with 1
increment by 1;
--
create or replace trigger ims_address_trigger
before insert on ims_address
for each row
begin
  select ims_address_seq.nextval into :new.ims_address_id from dual;
end;
/
--

insert all
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('9 Hallows Hill', '', 'Boston', 21, '02101')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('95655 Mcguire Plaza', '', 'New York', 32, '10048')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('4721 5th Park', '', 'Austin', 43, '78701')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('6 Twin Pines Alley', '', 'Sacramento', 5, '94203')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('18425 Nancy Place', '', 'Reno', 28, '89501')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('13764 Karstens Lane', '', 'Pittsburgh', 38, '15201')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('11 Dapin Trail', '', 'Bellevue', 47, '98004')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('69650 Ronald Regan Lane', '', 'Little Rock', 4, '72201')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('059 Hooker Circle', '', 'Atlanta', 10, '30301')
  into ims_address (street_address_1, street_address_2, address_city, state_id, address_zip) values ('22 Oxford Point', '', 'Orlando', 9, '32801')
select * from dual;
--

create table ims_client(
  ims_client_id number,
  client_name varchar2(100) not null,
  client_email varchar2(100) not null unique,
  point_of_contact_name varchar2(200) not null,
  client_phone varchar2(15) not null,
  client_fax varchar2(15) not null,
  address_id number not null,
  client_type_id number not null,
  constraint ims_client_pk primary key (ims_client_id),
  constraint address_fk foreign key (address_id) references ims_address(ims_address_id),
  constraint client_type_fk foreign key (client_type_id) references ims_client_type(client_type_id)
);

--
create sequence ims_client_seq
start with 1
increment by 1;
--
create or replace trigger ims_client_trigger
before insert on ims_client
for each row
begin
  select ims_client_seq.nextval into :new.ims_client_id from dual;
end;
/
--

insert all
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 1', 'JXTech1@jxtech.com', 'Gerald Hanson', '(544)998-8715', '(419)948-5706', 1, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 2', 'JXTech2@jxtech.com', 'William Reed', '(748)587-7326', '(366)279-4661', 2, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 3', 'JXTech3@jxtech.com', 'Nicole Greene', '(964)918-6196', '(382)797-3134', 3, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 4', 'JXTech4@jxtech.com', 'Shirley Fox', '(332)821-2846', '(328)255-4312', 4, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 5', 'JXTech5@jxtech.com', 'Phillip Wright', '(303)542-3442', '(855)957-0202', 5, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 6', 'JXTech6@jxtech.com', 'Bobby Williamson', '(541)171-7880', '(270)672-7113', 6, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 7', 'JXTech7@jxtech.com', 'Samuel Warren', '(240)133-3483', '(496)426-0323', 7, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 8', 'JXTech8@jxtech.com', 'Howard Weaver', '(618)995-0861', '(217)888-8875', 8, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 9', 'JXTech9@jxtech.com', 'Louis Lawson', '(601)598-6889', '(428)319-0060', 9, 2)
  into ims_client (client_name, client_email, point_of_contact_name, client_phone, client_fax, address_id, client_type_id) values ('JX Tech 10', 'JXTech10@jxtech.com', 'Catherine George', '(952)386-0208', '(595)226-8164', 10, 2)
select * from dual;
--

create table ims_purchase_order(
  order_number number,
  subtotal number not null,
  purchase_date date,
  tax_amount number not null,
  po_total number not null,
  client_id number not null,
  constraint ims_purchase_order_pk primary key(order_number),
  constraint client_fk foreign key (client_id) references ims_client(ims_client_id)
);
--
create sequence ims_purchase_order_seq
start with 1
increment by 1;
--

create table ims_po_line(
  order_number number not null,
  line_number number not null,
  unit_price number not null,
  quantity_ordered number not null,
  product_upc number not null,
  constraint ims_po_line_pk primary key (order_number, line_number),
  constraint po_fk foreign key (order_number)references ims_purchase_order(order_number),
  constraint product_fkv2 foreign key (product_upc) references ims_product(product_upc)
);
--
create sequence ims_po_line_seq
start with 1
increment by 1;
--
-- Create users table
create table IMS_USERS
(
  IMS_USERS_ID number,
  IMS_USERNAME varchar2(50) not null,
  IMS_PASSWORD varchar2(50) not null,
  USER_FIRST_NAME varchar2(100) not null,
  USER_LAST_NAME varchar2(100) not null,
  USER_EMAIL varchar2(150) not null,
  
  constraint IMS_USERS_PK primary key (IMS_USERS_ID),
  
  constraint IMS_USERS_UNv1 unique (IMS_USERNAME, USER_EMAIL)
);

-- Create users sequence
create sequence IMS_USERS_SEQ
  start with 1
  increment by 1;
  
-- Create users trigger
create or replace trigger IMS_USERS_TRIG
before insert on IMS_USERS
for each row
begin
  select IMS_USERS_SEQ.nextval into :new.IMS_USERS_ID from dual;
end;