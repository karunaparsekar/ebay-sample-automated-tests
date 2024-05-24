Feature: Title of your feature

  @smoke @sanity @Test
  Scenario Outline: Test all the categories on ebay home page
    Given User is on ebay home page
    When User clicks on shop by category
    And User clicks on '<category>'
    Then Validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | category      | url                                                 | title         |
      | Motors                 | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334     | eBay Motors                   |
      | Electronics            | https://www.ebay.com/b/Electronics/bn_7000259124                   | Electronics                   |
      | Clothing & Accessories | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Clothing, Shoes & Accessories |
      | Business & Industrial  | https://www.ebay.com/b/Business-Industrial/12576/bn_1853744        | Business & Industrial         |
      | Home & Garden | https://www.ebay.com/b/Home-Garden/11700/bn_1853126 | Home & Garden |
      | Sporting Goods         | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031               | Sporting Goods                |
      | Jewelry & Watches      | https://www.ebay.com/b/Jewelry-Watches/281/bn_1865273              | Jewelry & Watches             |
      | Other categories       | https://www.ebay.com/n/all-categories                              | Shop by Category              |
