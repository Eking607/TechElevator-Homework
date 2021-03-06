package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

		System.out.println(remainingNumberOfBirds);
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		
		System.out.println(numberOfExtraBirds);
		
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoons = 3;
		int numberOfRaccoonsThatLeaveForDinner = 2;
		int remainingRaccoonsInWoods = numberOfRaccoons - numberOfRaccoonsThatLeaveForDinner;
		
		System.out.println(remainingRaccoonsInWoods);

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfExtraFlowers = numberOfFlowers - numberOfBees;
		
		System.out.println(numberOfExtraFlowers);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int numberOfLonelyPigeons = 1;
		int numberOfRandomPigeons = 1;
		int numberOfPigeonsEatingBreadcrumbs = numberOfLonelyPigeons + numberOfRandomPigeons;
        
		System.out.println(numberOfPigeonsEatingBreadcrumbs);
		/*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int sittingOwls = 3;
		int randomOwls = 2;
		int numberOfOwlsOnFence = sittingOwls + randomOwls;
		
		System.out.println(numberOfOwlsOnFence);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeavers = 2;
		int numberOfBeaversThatLeave = 1;
		int numberOfBeaversStillWorking = numberOfBeavers - numberOfBeaversThatLeave;
		
		System.out.println(numberOfBeaversStillWorking);
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numberOfToucans = 2;
		int toucansThatJoin = 1;
		int totalNumberOfToucans = numberOfToucans + toucansThatJoin;
		
		System.out.println(totalNumberOfToucans);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int numberOfExtraSquirrels = numberOfSquirrels - numberOfNuts;
		
		System.out.println(numberOfExtraSquirrels);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double dimesFoundAmount = .10;
		double nickelsFoundAmount = .10;
		double totalAmountOfMoneyFound = dimesFoundAmount + nickelsFoundAmount;
		
		System.out.println(totalAmountOfMoneyFound);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersClassMuffins = 12;
		int macadamsClassMuffins = 20;
		int flannerysClassMuffins = 17;
		int totalMuffins = briersClassMuffins + macadamsClassMuffins + flannerysClassMuffins;
		
		System.out.println(totalMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoPrice = .24;
		double whistlePrice = .14;
		double totalAmountSpent = yoyoPrice + whistlePrice;
		
		System.out.println(totalAmountSpent);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalAmountOfMarshmallows = largeMarshmallows + miniMarshmallows;
		
		System.out.println (totalAmountOfMarshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltsSnow = 29;
		int brecknockSnow = 17;
		int differenceBetweenSchoolsSnow = hiltsSnow - brecknockSnow;
		
		System.out.println(differenceBetweenSchoolsSnow);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltCash = 10;
		int costOfToyTruck = 3;
		int costOfPencil = 2;
		int howMuchHiltHasLeftAfterBuyingStuff = hiltCash - costOfToyTruck - costOfPencil;
	
		System.out.println(howMuchHiltHasLeftAfterBuyingStuff);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int numberOfMarbles = 16;
		int numberOfMarblesLost = 7;
		int numberOfMarblesLeft = numberOfMarbles - numberOfMarblesLost;
		
		System.out.println(numberOfMarblesLeft);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int numberOfSeashells = 19;
		int numberOfSeashellsNeeded = 25;
		int numberOfSeashellsThatNeedToBeFound = numberOfSeashellsNeeded - numberOfSeashells;
		
		System.out.println(numberOfSeashellsThatNeedToBeFound);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int numberOfBalloons = 17;
		int numberOfRedBalloons = 8;
		int amountOfGreenBalloons = numberOfBalloons - numberOfRedBalloons;
		
		System.out.println(amountOfGreenBalloons);
	
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int numberOFBooks = 38;
		int numberOfBooksAdded = 10;
		int totalNumberOfBooks = numberOFBooks + numberOfBooksAdded;
		
		System.out.println(totalNumberOfBooks);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfLegs = 6;
		int numberofBees = 8;
		int totalNumberOfBeeLegs = numberOfLegs * numberofBees;
		
		System.out.println(totalNumberOfBeeLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double coneCost = .99;
		double totalCost = coneCost * 2;
		
		System.out.println(totalCost);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int numberOfRocksNeeded = 125;
		int rocksSoFar = 64;
		int totalOfRocksNeeded = numberOfRocksNeeded - rocksSoFar;
		
		System.out.println(totalOfRocksNeeded);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int totalMarbles = 38;
		int totalOfMarblesLost = 15;
		int totalAmountOfMarblesLeft = totalMarbles - totalOfMarblesLost;
		
		System.out.println(totalAmountOfMarblesLeft);
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMiles = 78;
		int totalMilesDrove = 32;
		int totalMilesLeftToDrive = totalMiles - totalMilesDrove;
		
		System.out.println(totalMilesLeftToDrive);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int minutesShovelingSnowSaturdayMorning = 90;
		int minutesShovelingSnowSaturdayAfternnon = 45;
		int totalAmountOfMinutesShoveling = minutesShovelingSnowSaturdayMorning + minutesShovelingSnowSaturdayAfternnon;
		
		System.out.println(totalAmountOfMinutesShoveling);
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int numberOfHotDogs = 6;
		double costOfHotdogs = .50;
		double totalCostOfHotdogs = (double) (numberOfHotDogs * costOfHotdogs);
		
		System.out.println(totalCostOfHotdogs);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltMoney = .50;
		double pencilPrice = .07;
		int numberOfPencilsHiltCanBuy = (int) (hiltMoney / pencilPrice);
		
		System.out.println(numberOfPencilsHiltCanBuy);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numberOfButterflies = 33;
		int orangeButterflies = 20;
		int numberOfRedButterflies = numberOfButterflies - orangeButterflies;
		
		System.out.println(numberOfRedButterflies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double kateCash = 1.00;
		double candyCost = .54;
		double kateChange = kateCash - candyCost;
		
		System.out.println(kateChange);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int trees = 13;
		int treesAdded = 12;
		int totalAmountOfTrees = trees + treesAdded;
		
		System.out.println(totalAmountOfTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursInADay = 24;
		int daysTillVisit = 2;
		int hoursTillJillSeesGma = hoursInADay * daysTillVisit;
		
		System.out.println (hoursTillJillSeesGma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int gum = 5;
		int gumNeeded = cousins * gum;
		
		System.out.println (gumNeeded);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double danMoney = 3.00;
		double candyBarCost = 1.00;
		double moneyLeft = danMoney - candyBarCost;
		
		System.out.println(moneyLeft);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int peoplePerBoat = 3;
		int peopleInBoats = boats * peoplePerBoat;
		
		System.out.println(peopleInBoats);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegos = 380;
		int legosLost = 57;
		int legosLeft = ellenLegos - legosLost;
		
		System.out.println(legosLeft);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffins = 35;
		int muffinsNeeded = 83;
		int muffinsLeftToBake = muffinsNeeded - muffins;
		
		System.out.println(muffinsLeftToBake);
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int differenceBetweenWillyAndLucy = willyCrayons - lucyCrayons;
		
		System.out.println(differenceBetweenWillyAndLucy);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickers = 10;
		int pages = 22;
		int totalStickers = stickers * pages;
		
		System.out.println(totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes = 96;
		int children = 8;
		int sharePerChild = cupcakes / children;
		
		System.out.println(sharePerChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbread = 47;
		int cookiesPerJar = 6;
		int remaindingCookies = 47 % 6;
		
		System.out.println(remaindingCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsMade = 59;
		int neighbors = 8;
		int croissantsLeftOver = croissantsMade % neighbors;
		
		System.out.println(croissantsLeftOver);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookies = 276;
		int cookiesPerTray = 12;
		int traysNeeded = oatmealCookies / cookiesPerTray;
		
		System.out.println(traysNeeded);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
		int servingSize = 12;
		int numberOfServings = pretzels / servingSize;
		
		System.out.println(numberOfServings);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int cupcakesLeft = 2;
		int cupcakesPerBox = 3;
		int boxesGivenAway = (lemonCupcakes - cupcakesLeft) / cupcakesPerBox;
		
		System.out.println(boxesGivenAway);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrots = 74;
		int people = 12;
		double carrotsLeft = ((double) carrots % people);
		
		System.out.println(carrotsLeft);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int shelvesMax = 7;
		int totalShelvesFilled = teddyBears / shelvesMax;
		
		System.out.println(totalShelvesFilled);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int pictures = 480;
		int albumCanHold = 20;
		int numberOfAlbumsNeeded = pictures / albumCanHold;
		
		System.out.println(numberOfAlbumsNeeded);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cards = 94;
		int boxCanHold = 8;
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int books = 210;
		int shelves = 10;
		int booksOnEachShelf = books / shelves;
		
		System.out.println(booksOnEachShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int croissants = 17;
		int guests = 7;
		int sharePerGuest = croissants / guests;
		
		System.out.println(sharePerGuest);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		
		double billAverage = 2.15;
		double jillAverage = 1.90;
		int rooms = 5;
		double billsTotal = billAverage * rooms;
		double jillsTotal = jillAverage * rooms;
		
		double totalTime = (billsTotal + jillsTotal) / 5;
		
		System.out.println(totalTime);
		
		

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		int n = 15;

		if (n % 5 == 0) {
		  // Fizz
		} else if (n % 3 == 0) {
		  // Buzz
		} else if (n % 3 == 0 && n % 5 == 0) {
		  // FizzBuzz
		}
		System.out.println(n);


	}

}
