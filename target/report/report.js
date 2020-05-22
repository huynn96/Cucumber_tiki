$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/vn/viettel/tiki.feature");
formatter.feature({
  "name": "Tiki Order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Tiki Order",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The homepage is displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "vn.viettel.StepDefinitions.the_homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user search product",
  "keyword": "When "
});
formatter.match({
  "location": "vn.viettel.StepDefinitions.the_user_search_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user choose item to card",
  "keyword": "And "
});
formatter.match({
  "location": "vn.viettel.StepDefinitions.the_user_choose_item_to_card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user checkout the card",
  "keyword": "And "
});
formatter.match({
  "location": "vn.viettel.StepDefinitions.the_user_checkout_the_card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The checkout page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "vn.viettel.StepDefinitions.the_checkout_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});