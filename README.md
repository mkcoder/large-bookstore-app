BUILD PROPERTIES

[![Build Status](https://travis-ci.org/mkcoder/large-bookstore-app.svg?branch=master)](https://travis-ci.org/mkcoder/large-bookstore-app) [![Coverage Status](https://coveralls.io/repos/github/mkcoder/large-bookstore-app/badge.svg?branch=master)](https://coveralls.io/github/mkcoder/large-bookstore-app?branch=master)
# Version 0.0.8
> So the architecture of our code base has evolved from small components to basically [.NET recommended architecture](https://msdn.microsoft.com/en-us/library/ee658099.aspx?f=255&MSPPError=-2147217396) which i believe is a lot better than most 
> Java architecture i have seen so far ```¯\_(ツ)_/¯``` so i will update the wiki with the new code base.

# Version 0.0.7
> I am here to bring you good news, I have completely removed the static file dependency and am now using Spring 
> [propertysource](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/PropertySource.html). Also updated Travis-CI to no longer skip test and so we test in our CI as well which is awesome. This has been one of my best commit I believe. 

# Version 0.0.6
> before going on my small break, i hit my first road block building this application.
> this update address that issue, we are now using [maven-versions plugin](http://www.mojohaus.org/versions-maven-plugin/)
> nothing much has changed otherwise
------

# Version 0.0.5

> ## roadblock
> hit my first road block with the app, was able to ```mvn clean install``` from root directory but indiviual project were failing to install 
> <sub><sup> sidenote will be on vaca until tuesday, hopefully figure out a versioning system for this, thinking about moving to gradle ```¯\_(ツ)_/¯``` </sub></sup>
-----
>## todos
>- [ ] remove the coupling of datasource and jdbc together
>- [X] create an interface that will use common resources
>- [X] start on a general SQLBuilder
>- [ ] - look into composite pattern
>- [ ] - look at example online
>- [X] - action plan

-----
# Version 0.0.4

>## update 
> - i added a new test to make sure the JDBCTeamplte configuration is working it is way to coupled and very unstable right now, which
> i don't like at all, hey the build runs fine :). Will try to decouple the implementation of the repository and the doas, from next 
> version on forward we will only use the repository pattern, but for this verison we will have DOAs in.

-----
>## todos
>- [ ] remove the coupling of datasource and jdbc together
>- [ ] create an interface that will use common resources
>- [ ] start on a general SQLBuilder
>- [ ] - look into composite pattern
>- [ ] - look at example online
>- [ ] - action plan

# 8/22/2016 -- Some release and future update note
> I'll try and put this on my blog as well and make a post about where i want to take the beta release ***(fingers crossed for end of September or middle of October)*** of the
> large-bookstore-app. For now i'm thinking about using JDBCTeamplate and/or NamedJDBCTtemplate and a custom SQLBuilder that i will  create and I will try to pull out the project into a separate repo and make it avialable on github.
> Then the future release of this app will completely remove the use of these two dependencies and rely only on (Spring Data)[http://projects.spring.io/spring-data/] and other frameworks.
> If you are wondering why? because i'll be learning those technologies in the mean time 😛


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
>- [X]  create a parent pom with versions in it

> ----------
      
# VERSION 0.0.2
    ## NOTES: 8-14-2016
      - add a builder, visitor, iterator pattern
        - most classes that are of type builder should build on top of this and implement or extend them
     - started working on a sql statement builder that should be able to work with mostly anything
> ----------
# VERSION 0.0.1
    ## NOTES: 8-6-2016
      - exported the .sql file out in the sql component v0.0.1.sql.file folder
      - created a maven project: will add spring jpa, hql and other technologies
