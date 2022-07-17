object test4{
    def main(args:Array[String]) = {
        def cost_of_before_discount(no_books:Int):Double=24.95*no_books;
        def cost_of_with_discount(no_books:Int):Double=cost_of_before_discount(no_books)-cost_of_before_discount(no_books)*.4
        def shipping_cost(no_books:Int):Double=if(no_books<=50) 3*no_books else 3*no_books+(no_books-50)*.75
        def totalCost(no_books:Int):Double=cost_of_with_discount(no_books)+shipping_cost(no_books);

        print(totalCost(60));
    }
}