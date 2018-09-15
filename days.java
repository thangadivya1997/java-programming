class Main {
  public static void main(String[] args) {
    int day = 1;
    String dayString;
    switch (day){
    case 0:
    dayString ="Sunday";
    System.out.println("Free Personal Pizza on purchase of medium Pizza");
    break;
    case 1:
    dayString ="Monday";
    System.out.println("Rs.101 OFF on a bill of Rs.400 and above" );
    break;
    case 3:
    dayString ="Tuesday";
    System.out.println("Free Plain Garlic Bread on another medium pizza");
    break;
    case 4:
    dayString ="Wednesday";
    System.out.println("Buy 1 Get 1 Free on any medium pizza");
    break;
    case 5:
    dayString ="Thursday";
    System.out.println("Buy any medium pizza and get 50% off on another medium pizza");
    break;
    case 6:
    dayString ="Friday";
    System.out.println("Tastiest pizza 20% off on bill of Rs.399 or above");
    break;
   }
}
}