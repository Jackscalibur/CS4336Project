CS 4336.0U1

# Information:

 ## Partners:
      
* Jackson Cowdrey, jtc190004
* Rafae Ahmad, rsa190001
      
## Running Process:
  
To run this project, create a DB titled "MovieDB," and populate it with the SQL script provided. The username and password are "scott" and "tiger."
  
## Front-end Web Files:

### ZipCode.xhtml
This web page is a form with output label that says "Enter Zip Code: ", an input box for the zip code with a validation aspect
that makes sure the length of the zip code is 5, and a button that says done that moves to the next page "TheaterList.xhtml".

### TheaterList.xhtml
This web page is a form with a data table that shows the theater that corresponds to the zip code entered as well as a command
link that when clicked on will take you to the next page "MovieList.xhtml". It also has a back button that will take you to the 
previous page.

### MovieList.xhtml
This web page is a form with a data table that shows the movie that corresponds to the theater picked as well as a command
link that when clicked on will take you to the next page "Payment.xhtml". This page has the information about each
movie shown such as a description and start time. It also has a back button that will take you to the previous page.

### Payment.xhtml
This web page has a panel grid that shows that title, start time, as well as the price of the movie chosen. It also has a place
to enter a credit card number in which depending on if the number is 16 digits a message will appear under it saying if it was
successful or not. It has a done button and a back button to go to the previous page.

## Back-end Java Files:

### ZipCodeBean.java
This is a JSF CDI bean for ZipCode.xhtml in which there are a constructer and getters and setters for the 2 variables
that could be used, The EJB and the variable that contains the zip code entered on the start page.

### TheaterListBean.java
This is a JSF CDI bean for TheaterList.xhtml in which there are a constructer and getters and setters for the 2 variables
that could be used, The EJB and the variable that contains the zip code that is needed for the other methods. It has a method
called showTheaterList in which when evoked it will transfer the given zip code into this bean’s zip code variable and switch
the page to the TheaterList.xhtml page. The other method is called TheaterList in which the method will call the EJB method
with the zip code variable in order to return a list of theaters that correspond to the zip code.

### MovieListBean.java
This is a JSF CDI bean for MovieList.xhtml in which there are a constructer and getters and setters for the 3 variables that
could be used which are the EJB, the variable that contains the id, and the variable that contains the theater, all of which
is needed for the other methods. It has a method called showMovieList in which when evoked it will transfer the given theater into
this bean’s theater variable and switch the page to the MovieList.xhtml page. The other method is called MovieList in which
the method will call the EJB method with the theater variable in order to return a list of movies that correspond to the theater.

### PaymentBean.java
This is a JSF CDI bean for Payment.xhtml in which there are a constructer and getters and setters for the 4 variables that
could be used which are the EJB, the variable that contains the movie, the variable that contains the message, and the variable
that contains the credit card number, all of which is needed for the other methods. It has a method called payment in which
when evoked it will transfer the given movie into this bean’s movie variable and switch the page to the Payment.xhtml page.
The other method is called validate which is where it will check that the credit card number variable is 16 digits long.

### MovieAndTheaterEJB.java
This is a EJB bean in which there is a persistence method, a method that will find theaters based on a zip by invoking a query
in the TheaterEntity.java page and return the resulting list, and a method that will find movies based on a theater by invoking a
query in the MovieEntity.java page and return the resulting list.

### MovieEntity.java
This is an entity that was created automatically by our database MovieDB. I added a query to find movies based on the theater ID.

### TheaterEntity.java
This is an entity that was created automatically by our database MovieDB.

### PaymentEntity.java
This is an entity that is used to host payment transaction data that will be used later for the database interactions when requesting
from the user.

### TicketEntity.java
This is an entity that is used to host ticket information that will be used later for the database interactions when requesting from the
user.
