# Services readme
## What are services
Services can be both micro/large they specialize in doing one thing well. Services should follow the SRP (single responsibility principle) meaning they should only be responsible for one thing and one thing only. If one services is calling another services for more than a single thing, this is a good case this service is doing a lot of things and should be broken into many small services. Rather than one large monolithic service that does everything, aim at creating small services.

A rule of thumb is that: one service should try to use only one model. With that said, it could be possible to nest multiple models into one model see A large model example

## A good service example
### Bad:
BookServices
  - gets all the books from the database
  - gets all the reviews from the database associated with the books
  - make sure user hasn't purchased these books before
  
### Good:
BookService
 - gets all the books from the database
 
 BookNotPurchasedByUserService
 - gets all the books not purchased by the user from the database 

ReviewService
 - gets all the books from the database
  
### A large model example
Book
  - isbn
  - title
  - author_id
  - price

Review
  - book_id
  - user_id
  - comment  

BookReviews
  - Book
  - Review
  

  
  - 
