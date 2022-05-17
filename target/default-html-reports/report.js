$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ui/addFile.feature");
formatter.feature({
  "name": "As a user, I want to add a file as favorite",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to add file as favourite",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User logs in to tryCloud app",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User hovers to app menu and click on \"Files\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User should be landed to files dashboard",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on more options icon of the first file",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on Add to Favourites",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "First file should have a star sign on top of the icon",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "First file should be moved to \"Favourites\" folder",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});