Expanding the functionality of the class without modify


We have store and there sell products as in any other stores with a price (Interface Product - get Price)
And has certain product - Milk which implements 

And suddenly we have this situation :
    Someone wants buy much more bottles of milks for kittens and he will get discount,but our object
    has been already created. What way?

Need : Create other objects, which calculate discount and if anything... had the chance return back, loosely speaking, want turn on/off discount


Solution :
 Create Abstract Class (Decorator) with implements Product with field Product