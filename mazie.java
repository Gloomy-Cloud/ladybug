import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mazie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mazie extends World
{

    /**
     * Constructor for objects of class mazie.
     * 
     */
    public mazie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mazeblock mazeblock = new mazeblock();
        addObject(mazeblock,7*50,8*50);
        mazeblock mazeblock2 = new mazeblock();
        addObject(mazeblock2,4*50,8*50);
        mazeblock mazeblock3 = new mazeblock();
        addObject(mazeblock3,7*50,8*50);
        mazeblock mazeblock4 = new mazeblock();
        addObject(mazeblock4,5*50,7*50);
        mazeblock mazeblock5 = new mazeblock();
        addObject(mazeblock5,5*50,8*50);
        mazeblock mazeblock6 = new mazeblock();
        addObject(mazeblock6,5*50,8*50);
        mazeblock mazeblock7 = new mazeblock();
        addObject(mazeblock7,6*50,9*50);
        mazeblock mazeblock8 = new mazeblock();
        addObject(mazeblock8,4*50,8*50);
        mazeblock mazeblock9 = new mazeblock();
        addObject(mazeblock9,5*50,6*50);
        mazeblock mazeblock10 = new mazeblock();
        addObject(mazeblock10,5*50,8*50);
        mazeblock mazeblock11 = new mazeblock();
        addObject(mazeblock11,5*50,7*50);
        mazeblock mazeblock12 = new mazeblock();
        addObject(mazeblock12,6*50,6*50);
        mazeblock mazeblock13 = new mazeblock();
        addObject(mazeblock13,6*50,7*50);
        mazeblock mazeblock14 = new mazeblock();
        addObject(mazeblock14,5*50,8*50);
        mazeblock mazeblock15 = new mazeblock();
        addObject(mazeblock15,5*50,8*50);
        mazeblock mazeblock16 = new mazeblock();
        addObject(mazeblock16,5*50,8*50);
        mazeblock mazeblock17 = new mazeblock();
        addObject(mazeblock17,5*50,6*50);
        mazeblock mazeblock18 = new mazeblock();
        addObject(mazeblock18,4*50,8*50);
        mazeblock mazeblock19 = new mazeblock();
        addObject(mazeblock19,4*50,8*50);
        mazeblock mazeblock20 = new mazeblock();
        addObject(mazeblock20,6*50,6*50);
        mazeblock mazeblock21 = new mazeblock();
        addObject(mazeblock21,5*50,7*50);
        mazeblock mazeblock22 = new mazeblock();
        addObject(mazeblock22,5*50,9*50);
        mazeblock mazeblock23 = new mazeblock();
        addObject(mazeblock23,6*50,9*50);
        mazeblock mazeblock24 = new mazeblock();
        addObject(mazeblock24,7*50,9*50);
        mazeblock mazeblock25 = new mazeblock();
        addObject(mazeblock25,1*50,9*50);
        mazeblock mazeblock26 = new mazeblock();
        addObject(mazeblock26,1*50,5*50);
        mazeblock mazeblock27 = new mazeblock();
        addObject(mazeblock27,1*50,5*50);
        mazeblock mazeblock28 = new mazeblock();
        addObject(mazeblock28,1*50,8*50);
        mazeblock mazeblock29 = new mazeblock();
        addObject(mazeblock29,6*50,9*50);
        mazeblock mazeblock30 = new mazeblock();
        addObject(mazeblock30,8*50,9*50);
        mazeblock mazeblock31 = new mazeblock();
        addObject(mazeblock31,9*50,7*50);
        mazeblock mazeblock32 = new mazeblock();
        addObject(mazeblock32,10*50,10*50);
        mazeblock mazeblock33 = new mazeblock();
        addObject(mazeblock33,6*50,10*50);
        mazeblock mazeblock34 = new mazeblock();
        addObject(mazeblock34,2*50,9*50);
        mazeblock mazeblock35 = new mazeblock();
        addObject(mazeblock35,1*50,7*50);
        mazeblock mazeblock36 = new mazeblock();
        addObject(mazeblock36,9*50,8*50);
        mazeblock mazeblock37 = new mazeblock();
        addObject(mazeblock37,10*50,8*50);
        mazeblock34.setLocation(1*50,11*50);
        mazeblock34.setLocation(1*50,11*50);
        mazeblock25.setLocation(1*50,8*50);
        mazeblock27.setLocation(1*50,6*50);
        mazeblock27.setLocation(2*50,6*50);
        mazeblock2.setLocation(2*50,9*50);
        mazeblock2.setLocation(3*50,9*50);
        mazeblock22.setLocation(2*50,11*50);
        mazeblock19.setLocation(2*50,8*50);
        mazeblock18.setLocation(3*50,8*50);
        mazeblock25.setLocation(1*50,10*50);
        mazeblock33.setLocation(2*50,11*50);
        mazeblock7.setLocation(3*50,11*50);
        mazeblock7.setLocation(3*50,11*50);
        mazeblock7.setLocation(4*50,11*50);
        mazeblock24.setLocation(0,11*50);
        mazeblock25.setLocation(0,10*50);
        mazeblock30.setLocation(0,8*50);
        mazeblock18.setLocation(5*50,10*50);
        mazeblock6.setLocation(7*50,5*50);
        mazeblock22.setLocation(2*50,10*50);
        mazeblock23.setLocation(3*50,10*50);
        mazeblock7.setLocation(4*50,10*50);
        mazeblock22.setLocation(8*50,9*50);
        mazeblock7.setLocation(4*50,9*50);
        mazeblock2.setLocation(4*50,7*50);
        mazeblock2.setLocation(4*50,5*50);
        mazeblock6.setLocation(5*50,11*50);
        mazeblock2.setLocation(2*50,5*50);
        mazeblock9.setLocation(2*50,4*50);
        mazeblock9.setLocation(2*50,3*50);
        mazeblock12.setLocation(1*50,2*50);
        mazeblock14.setLocation(1*50,2*50);
        mazeblock12.setLocation(2*50,2*50);
        mazeblock7.setLocation(4*50,10*50);
        mazeblock7.setLocation(4*50,9*50);
        mazeblock6.setLocation(7*50,5*50);
        mazeblock18.setLocation(5*50,10*50);
        mazeblock8.setLocation(3*50,7*50);
        mazeblock35.setLocation(2*50,7*50);
        mazeblock26.setLocation(1*50,6*50);
        mazeblock23.setLocation(3*50,11*50);
        mazeblock18.setLocation(5*50,9*50);
        mazeblock15.setLocation(6*50,10*50);
        mazeblock.setLocation(7*50,10*50);
        mazeblock.setLocation(8*50,8*50);
        mazeblock3.setLocation(7*50,9*50);
        mazeblock32.setLocation(7*50,10*50);
        mazeblock36.setLocation(10*50,9*50);
        mazeblock31.setLocation(10*50,7*50);
        mazeblock36.setLocation(10*50,6*50);
        mazeblock mazeblock38 = new mazeblock();
        addObject(mazeblock38,9*50,9*50);
        mazeblock mazeblock39 = new mazeblock();
        addObject(mazeblock39,8*50,6*50);
        mazeblock mazeblock40 = new mazeblock();
        addObject(mazeblock40,8*50,5*50);
        mazeblock mazeblock41 = new mazeblock();
        addObject(mazeblock41,7*50,4*50);
        mazeblock mazeblock42 = new mazeblock();
        addObject(mazeblock42,6*50,3*50);
        mazeblock mazeblock43 = new mazeblock();
        addObject(mazeblock43,7*50,3*50);
        mazeblock mazeblock44 = new mazeblock();
        addObject(mazeblock44,7*50,3*50);
        mazeblock mazeblock45 = new mazeblock();
        addObject(mazeblock45,8*50,3*50);
        mazeblock mazeblock46 = new mazeblock();
        addObject(mazeblock46,7*50,3*50);
        mazeblock mazeblock47 = new mazeblock();
        addObject(mazeblock47,8*50,3*50);
        mazeblock mazeblock48 = new mazeblock();
        addObject(mazeblock48,8*50,2*50);
        mazeblock mazeblock49 = new mazeblock();
        addObject(mazeblock49,6*50,1*50);
        mazeblock mazeblock50 = new mazeblock();
        addObject(mazeblock50,7*50,1*50);
        mazeblock mazeblock51 = new mazeblock();
        addObject(mazeblock51,7*50,2*50);
        mazeblock mazeblock52 = new mazeblock();
        addObject(mazeblock52,8*50,2*50);
        mazeblock mazeblock53 = new mazeblock();
        addObject(mazeblock53,8*50,2*50);
        mazeblock41.setLocation(10*50,5*50);
        mazeblock38.setLocation(10*50,9*50);
        mazeblock42.setLocation(10*50,10*50);
        mazeblock45.setLocation(9*50,4*50);
        mazeblock47.setLocation(11*50,4*50);
        mazeblock43.setLocation(3*50,6*50);
        mazeblock43.setLocation(4*50,5*50);
        mazeblock43.setLocation(5*50,5*50);
        mazeblock45.setLocation(7*50,4*50);
        mazeblock45.setLocation(5*50,4*50);
        mazeblock51.setLocation(5*50,3*50);
        mazeblock49.setLocation(5*50,2*50);
        mazeblock48.setLocation(8*50,4*50);
        mazeblock48.setLocation(7*50,3*50);
        mazeblock50.setLocation(7*50,1*50);
        mazeblock48.setLocation(7*50,2*50*50);
        mazeblock mazeblock54 = new mazeblock();
        addObject(mazeblock54,10*50,1*50);
        mazeblock mazeblock55 = new mazeblock();
        addObject(mazeblock55,10*50,1*50);
        mazeblock mazeblock56 = new mazeblock();
        addObject(mazeblock56,10*50,2*50);
        mazeblock mazeblock57 = new mazeblock();
        addObject(mazeblock57,11*50,2*50);
        mazeblock mazeblock58 = new mazeblock();
        addObject(mazeblock58,9*50,2*50);
        mazeblock mazeblock59 = new mazeblock();
        addObject(mazeblock59,8*50,2*50);
        mazeblock mazeblock60 = new mazeblock();
        addObject(mazeblock60,8*50,3*50);
        mazeblock mazeblock61 = new mazeblock();
        addObject(mazeblock61,9*50,3*50);
        mazeblock mazeblock62 = new mazeblock();
        addObject(mazeblock62,10*50,3*50);
        mazeblock mazeblock63 = new mazeblock();
        addObject(mazeblock63,10*50,4*50);
        mazeblock mazeblock64 = new mazeblock();
        addObject(mazeblock64,9*50,4*50);
        mazeblock mazeblock65 = new mazeblock();
        addObject(mazeblock65,10*50,4*50);
        mazeblock mazeblock66 = new mazeblock();
        addObject(mazeblock66,9*50,5*50);
        mazeblock mazeblock67 = new mazeblock();
        addObject(mazeblock67,9*50,5*50);
        mazeblock58.setLocation(2*50,1*50);
        mazeblock50.setLocation(3*50,1*50);
        mazeblock46.setLocation(4*50,11*50);
        mazeblock57.setLocation(9*50,1*50);
        mazeblock61.setLocation(8*50,1*50);
        mazeblock64.setLocation(7*50,0);
        mazeblock48.setLocation(6*50,0);
        mazeblock59.setLocation(5*50,0);
        mazeblock53.setLocation(1*50,0);
        mazeblock53.setLocation(0,0);
        mazeblock61.setLocation(6*50,2*50);
        mazeblock47.setLocation(11*50,5*50);
        mazeblock64.setLocation(11*50,2*50);
        mazeblock35.setLocation(3*50,8*50);
        mazeblock8.setLocation(3*50,6*50);
        mazeblock4.setLocation(7*50,0);
        mazeblock16.setLocation(6*50,5*50);
        mazeblock16.setLocation(7*50,6*50);
        mazeblock15.setLocation(7*50,2*50);
        mazeblock16.setLocation(9*50,8*50);
        mazeblock15.setLocation(6*50,5*50);
        mazeblock31.setLocation(7*50,5*50);
        mazeblock3.setLocation(7*50,8*50);
        mazeblock.setLocation(8*50,7*50);
        mazeblock39.setLocation(9*50,9*50);
        mazeblock39.setLocation(7*50,2*50);
        mazeblock44.setLocation(8*50,2*50);
        mazeblock7.setLocation(9*50,9*50);
        mazeblock26.setLocation(3*50,7*50);
        mazeblock27.setLocation(1*50,4*50);
        mazeblock8.setLocation(1*50,3*50);
        mazeblock17.setLocation(2*50,4*50);
        mazeblock18.setLocation(4*50,5*50);
        mazeblock43.setLocation(5*50,6*50);
        mazeblock15.setLocation(6*50,650);
        mazeblock31.setLocation(7*50,6*50);
        mazeblock40.setLocation(8*50,6*50);
        mazeblock66.setLocation(9*50,6*50);
        mazeblock66.setLocation(9*50,7*50);
        mazeblock41.setLocation(10*50,7*50);
        mazeblock47.setLocation(11*50,6*50);
        mazeblock45.setLocation(4*50,1*50);
        mazeblock45.setLocation(5*50,1*50);
        mazeblock32.setLocation(3*50,5*50);
        mazeblock27.setLocation(1*50,0*50);
        mazeblock58.setLocation(8*50,8*50);
        mazeblock12.setLocation(2*50,2*50);
        mazeblock9.setLocation(7*50,7*50);
        mazeblock8.setLocation(6*50,8*50);
        mazeblock6.setLocation(1*50,4*50);
        mazeblock6.setLocation(1*50,5*50);
        mazeblock6.setLocation(1*50,6*50);
        mazeblock57.setLocation(8*50,0);
        mazeblock15.setLocation(6*50,5*50);
        mazeblock43.setLocation(6*50,6*50);
        mazeblock4.setLocation(5*50,6*50);
        mazeblock4.setLocation(5*50,11*50);
        mazeblock3.setLocation(5*50,11*50);
        mazeblock3.setLocation(6*50,9*50);
        mazeblock29.setLocation(7*50,9*50);
        mazeblock7.setLocation(8*50,9*50);
        mazeblock.setLocation(8*50,11*50);
        mazeblock42.setLocation(8*50,11*50);
        mazeblock40.setLocation(9*50,11*50);
        mazeblock58.setLocation(10*50,11*50);
        mazeblock38.setLocation(11*50,11*50);
        mazeblock9.setLocation(8*50,6*50);
        mazeblock13.setLocation(6*50,8*50);
        mazeblock16.setLocation(8*50,8*50);
        mazeblock16.setLocation(8*50,8*50);
        mazeblock67.setLocation(9*50,5*50);
        mazeblock52.setLocation(3*50,2*50);
        mazeblock63.setLocation(10*50,9*50);
        mazeblock9.setLocation(4*50,4*50);
        mazeblock65.setLocation(10*50,9*50);
        mazeblock66.setLocation(11*50,4*50);
        mazeblock18.setLocation(5*50,9*50);
        mazeblock9.setLocation(4*50,4*50);
        mazeblock9.setLocation(5*50,4*50);
        mazeblock45.setLocation(8*50,4*50);
        mazeblock67.setLocation(9*50,6*50);
        mazeblock45.setLocation(8*50,6*50);
        mazeblock mazeblock68 = new mazeblock();
        addObject(mazeblock68,283,581);
        mazeblock68.setLocation(200,644);
        mazeblock68.setLocation(238,613);
        mazeblock68.setLocation(439,628);
        mazeblock68.setLocation(425,602);
        mazeblock4.setLocation(413,596);
        mazeblock68.setLocation(289,582);
        mazeblock68.setLocation(366,651);
        mazeblock68.setLocation(393,596);
        mazeblock68.setLocation(434,598);
        mazeblock68.setLocation(420,583);
        mazeblock68.setLocation(425,590);
        mazeblock68.setLocation(426,483);
        mazeblock68.setLocation(451,511);
        mazeblock68.setLocation(465,491);
        mazeblock68.setLocation(603,540);
        mazeblock68.setLocation(589,545);
        mazeblock mazeblock69 = new mazeblock();
        addObject(mazeblock69,560,417);
        mazeblock69.setLocation(626,305);
        mazeblock69.setLocation(560,382);
        mazeblock69.setLocation(584,315);
        mazeblock69.setLocation(586,311);
        mazeblock69.setLocation(593,293);
        mazeblock69.setLocation(594,282);
        mazerunner mazerunner = new mazerunner();
        addObject(mazerunner,15,453);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,345,351);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,142,196);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,297,142);
        mazeblock69.setLocation(594,307);
        mazeblock69.setLocation(588,302);
        mazeblock69.setLocation(584,304);
        mazeblock47.setLocation(582,299);
        mazeblock69.setLocation(588,303);
        mazeblock68.setLocation(586,541);
        mazeblock49.setLocation(399,191);
        mazeblock47.setLocation(526,303);
        mazeblock47.setLocation(556,302);
        mazeblock47.setLocation(535,299);
        mazeblock47.setLocation(556,309);
        mazeblock47.setLocation(542,312);
        EnemyFlyer enemyFlyer = new EnemyFlyer();
        addObject(enemyFlyer,26,348);
        EnemyFlyer enemyFlyer2 = new EnemyFlyer();
        addObject(enemyFlyer2,22,45);
        enemyFlyer.setLocation(20,340);
        YouWinPlatform youWinPlatform = new YouWinPlatform();
        addObject(youWinPlatform,564,44);
        youWinPlatform.setLocation(572,41);
        mazeblock47.setLocation(540,298);
        speedBoost.setLocation(345,354);
        SpeedBoost speedBoost4 = new SpeedBoost();
        addObject(speedBoost4,345,354);
        speedBoost.setLocation(314,349);
        speedBoost4.setLocation(469,417);
        removeObject(speedBoost4);
        YouWinScreen youWinScreen = new YouWinScreen();
        addObject(youWinScreen,422,346);
        youWinScreen.setLocation(282,296);
        mazeblock11.setLocation(262,368);
        mazeblock11.setLocation(260,384);
        youWinScreen.setLocation(365,439);
        youWinScreen.setLocation(314,410);
        mazeblock29.setLocation(308,314);
        removeObject(mazeblock3);
        mazeblock20.setLocation(786,244);
        youWinScreen.setLocation(700,288);
        mazeblock15.setLocation(339,680);
        mazeblock15.setLocation(673,262);
        youWinScreen.setLocation(268,226);
        removeObject(youWinScreen);
        mazeblock8.setLocation(286,449);
        mazeblock5.setLocation(255,506);
        mazeblock13.setLocation(282,453);
        mazeblock11.setLocation(246,532);
        mazeblock4.setLocation(293,527);
        mazeblock11.setLocation(265,534);
        mazeblock4.setLocation(290,542);
        mazeblock11.setLocation(253,535);
        mazeblock66.setLocation(506,182);
        mazeblock64.setLocation(348,559);
        mazeblock68.setLocation(586,555);
        mazeblock54.setLocation(562,203);
        mazeblock69.setLocation(586,293);
        mazeblock4.setLocation(297,536);
        mazeblock11.setLocation(259,537);
        mazeblock11.setLocation(234,544);
        mazeblock4.setLocation(272,553);
        mazeblock64.setLocation(317,559);
        mazeblock5.setLocation(368,550);
        mazeblock8.setLocation(361,445);
        mazeblock13.setLocation(312,450);
        mazeblock8.setLocation(336,446);
        mazeblock29.setLocation(247,318);
        mazeblock66.setLocation(496,206);
        mazeblock66.setLocation(495,208);
        mazeblock54.setLocation(541,196);
        mazeblock20.setLocation(240,94);
        mazeblock15.setLocation(87,139);
        mazeblock15.setLocation(123,149);
        mazeblock20.setLocation(247,103);
        mazeblock66.setLocation(512,194);
        mazeblock8.setLocation(304,440);
        mazeblock8.setLocation(362,440);
        mazeblock8.setLocation(362,440);
        mazeblock13.setLocation(306,439);
        mazeblock8.setLocation(331,444);
        mazeblock29.setLocation(242,297);
        mazeblock11.setLocation(243,548);
        mazeblock4.setLocation(278,545);
        mazeblock11.setLocation(248,546);
        mazeblock4.setLocation(314,540);
        mazeblock66.setLocation(492,182);
        mazeblock15.setLocation(87,150);
        mazeblock4.setLocation(285,533);
        mazeblock4.setLocation(329,534);
        mazeblock4.setLocation(280,544);
        mazeblock8.setLocation(306,440);
        mazeblock8.setLocation(354,446);
        mazeblock29.setLocation(262,304);
        mazeblock20.setLocation(260,102);
        mazeblock29.setLocation(251,306);
        mazeblock66.setLocation(499,196);
        mazeblock15.setLocation(118,150);
        mazeblock64.setLocation(328,542);
        mazeblock4.setLocation(291,535);
        mazeblock4.setLocation(272,539);
        mazeblock4.setLocation(254,542);
        mazeblock4.setLocation(281,538);
        mazeblock4.setLocation(310,546);
        mazeblock13.setLocation(298,456);
        mazeblock8.setLocation(335,452);
        mazeblock8.setLocation(337,453);
        mazeblock15.setLocation(93,137);
        mazeblock4.setLocation(362,545);
        mazeblock4.setLocation(280,541);
        mazeblock5.setLocation(307,544);
        mazeblock4.setLocation(272,541);
        mazeblock18.setLocation(270,448);
        mazeblock18.setLocation(255,448);
        mazeblock13.setLocation(288,454);
        mazeblock5.setLocation(357,544);
        mazeblock5.setLocation(316,544);
        mazeblock4.setLocation(282,531);
        mazeblock4.setLocation(278,534);
        mazeblock5.setLocation(302,539);
        mazeblock18.setLocation(240,462);
        mazeblock13.setLocation(287,462);
        mazeblock15.setLocation(94,144);
        mazeblock64.setLocation(392,548);
        removeObject(mazeblock42);
        removeObject(mazeblock64);
        mazeblock5.setLocation(364,559);
        mazeblock4.setLocation(304,537);
        mazeblock11.setLocation(266,540);
        mazeblock4.setLocation(294,542);
        mazeblock5.setLocation(328,540);
        mazeblock18.setLocation(242,448);
        mazeblock13.setLocation(299,446);
        mazeblock8.setLocation(353,448);
        mazeblock11.setLocation(250,544);
        mazeblock5.setLocation(355,548);
        mazeblock18.setLocation(258,446);
        mazeblock13.setLocation(304,453);
        mazeblock13.setLocation(296,453);
        mazeblock18.setLocation(264,450);
        mazeblock4.setLocation(303,548);
        mazeblock11.setLocation(255,547);
        mazeblock4.setLocation(287,545);
        mazeblock5.setLocation(357,562);
        mazeblock4.setLocation(319,554);
        mazeblock4.setLocation(286,548);
        mazeblock5.setLocation(338,550);
        mazeblock13.setLocation(260,448);
        mazeblock13.setLocation(310,450);
        mazeblock18.setLocation(241,442);
        mazeblock11.setLocation(233,546);
        mazeblock5.setLocation(350,552);
        mazeblock4.setLocation(315,553);
        mazeblock11.setLocation(247,550);
        mazeblock4.setLocation(278,549);
        mazeblock18.setLocation(260,454);
        mazeblock18.setLocation(244,446);
        mazeblock4.setLocation(308,554);
        mazeblock18.setLocation(265,466);
        mazeblock4.setLocation(284,550);
        mazeblock18.setLocation(246,438);
        mazeblock4.setLocation(306,537);
        mazeblock4.setLocation(303,550);
        mazeblock18.setLocation(266,450);
    }
}
