#Author: karunaparsekar@gmail.com
#Feature: Ebay Home Page Test Scenarios
Feature: Title of your feature

  @sanity @Test
  Scenario: Advance search link
    Given User is on ebay home page
    When User clicks on Advance search link
    And User navigates to Advance search page
    And User enters below data to get required serach result
      | keyword  | keywordOptions           | exclude     | category                  |
      | iphone13 | All words, any order     | refurbished | All Categories            |
      | iphone11 | Any words, any order     | refurbished | All Categories            |
      | iphone10 | Exact words, exact order | refurbished | All Categories            |
      | iphone9  | Exact words, any order   | refurbished | Cell Phones & Accessories |
