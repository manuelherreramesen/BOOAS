

# Welcome to BOOAS

### What does mean BOOAS?
Basic Operation Of A Service

## Tech Stack

* Java 17
* Maven 3
* Spring 6
* Spring Boot 3
  * Spring Wweb
  * Spring Data JPA
  * Spring Dev
* Kotlin 1.8.0

<details> 
<summary> Data Base Info</summary>

* Create Table

`CREATE TABLE public.persona (`
`id serial4 NOT NULL,`
`nombre varchar NOT NULL,`
`apellido varchar NULL,`
`email varchar NOT NULL,`
`phone varchar NOT NULL`
`);`

* Insert 

```INSERT INTO public.persona (nombre,apellido,email,phone) VALUES```
```('','','andres.ramirez@email.com',''),```
```('Andres','Ramirez','andres.ramirez@email.com','88889999');```

* Select

`SELECT id, nombre, apellido, email, phone`
`FROM public.persona;`

* DELETE

`DELETE FROM public.persona`
`WHERE tableoid=0 AND cmax=? AND xmax=? AND cmin=? AND xmin=? AND ctid=? AND id=nextval('persona_id_seq'::regclass) AND nombre='' AND apellido='' AND email='' AND phone='';`

</details>
<br>
<details>
<summary>Postman</summary>

* SAVE
 
![Screenshot 2023-03-21 at 21.54.26.png](..%2F..%2F..%2F..%2FDesktop%2FScreenshot%202023-03-21%20at%2021.54.26.png)

* GET

![Screenshot 2023-03-21 at 21.54.36.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2F80%2Fgzxt10r50077j78xncswfb1r0000gs%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_V8dyzf%2FScreenshot%202023-03-21%20at%2021.54.36.png)
</details>