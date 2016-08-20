# VERSION 0.0.1
    ## NOTES: 8-6-2016
      - exported the .sql file out in the sql component v0.0.1.sql.file folder
      - created a maven project: will add spring jpa, hql and other technologies
      
      
# VERSION 0.0.2
    ## NOTES: 8-14-2016
      - add a builder, visitor, iterator pattern
        - most classes that are of type builder should build on top of this and implement or extend them
     - started working on a sql statement builder that should be able to work with mostly anything

# Version 0.0.3

>## new features:
>   - #1 WIP moved some code around to make it more OOP of sorts
>   - #2  WIP maybe should create a maven plugin to manage my app versions and will make this avilable.
>
>>   *idea:* a maven plugin that runs at compile time traverse the
>> project directory and finds the pom.xml and parses using some XML
>> parseer and finds the version tag and then puts the version from this
>> plguin.
>
> - add a new repository pattern in the pattern-component that will serve
> as a basic repository that all **table** must implement and we are
> still working on getting a SQL builder that is generic enough to work
> on everything thinking about using a [visitor
> pattern](https://github.com/mkcoder/visitor-design-pattern-in-java)
> along side some dependency injection and builder to create an SQLStatement using the [Spring JDBC (link)](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/jdbc.html)
>
> ----------
>## update
> - update the table iterator to have a abstract iterator that every database table should implement and this will iterate through the model and retrieve the fields, **meaning these should match the name of the database column, a work around for this is create various annotations and check if the annotation is available.  **
>
>
>-----
>## todos
>-  create a parent pom with versions in it