$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EbaySearchResults.feature");
formatter.feature({
  "line": 1,
  "name": "Search Results. Where one can sort, filter and see details of resulting products.",
  "description": "",
  "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search and verify results",
  "description": "",
  "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.;search-and-verify-results",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@001"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a non-registered customer And I navigate to www.ebay.co.uk in browser \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for an item \"\u003csearchItem\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I get a list of matching results for item \"\u003csearchItem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Resulting items cards show: postage price, No of bids, price or show BuyItNow tag",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I can sort the results by Lowest Price And the results are listed in the page in the correct order",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I can sort the results by Highest Price And the results are listed in the page in the correct order",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I can filter the results by \u0027Buy it now\u0027 And all the results shown in the page have the \u0027Buy it now\u0027 tag",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.;search-and-verify-results;",
  "rows": [
    {
      "cells": [
        "browser",
        "searchItem"
      ],
      "line": 14,
      "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.;search-and-verify-results;;1"
    },
    {
      "cells": [
        "chrome",
        "Kids Winter Wear"
      ],
      "line": 15,
      "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.;search-and-verify-results;;2"
    },
    {
      "cells": [
        "chrome",
        "Mobiles"
      ],
      "line": 16,
      "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.;search-and-verify-results;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Search and verify results",
  "description": "",
  "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.;search-and-verify-results;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@001"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a non-registered customer And I navigate to www.ebay.co.uk in browser \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for an item \"Kids Winter Wear\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I get a list of matching results for item \"Kids Winter Wear\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Resulting items cards show: postage price, No of bids, price or show BuyItNow tag",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I can sort the results by Lowest Price And the results are listed in the page in the correct order",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I can sort the results by Highest Price And the results are listed in the page in the correct order",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I can filter the results by \u0027Buy it now\u0027 And all the results shown in the page have the \u0027Buy it now\u0027 tag",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 76
    }
  ],
  "location": "ResultStepDefinition.navigateToEbayWebsite(String)"
});
formatter.result({
  "duration": 8749609209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kids Winter Wear",
      "offset": 22
    }
  ],
  "location": "ResultStepDefinition.searchForItem(String)"
});
formatter.result({
  "duration": 2834109711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kids Winter Wear",
      "offset": 43
    }
  ],
  "location": "ResultStepDefinition.listMatchingResults(String)"
});
formatter.result({
  "duration": 42720120,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDefinition.verifyTagsAndLabels()"
});
formatter.result({
  "duration": 152257,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDefinition.sortWithLowestPrice()"
});
formatter.result({
  "duration": 6722585633,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDefinition.sortWithHighestPrice()"
});
formatter.result({
  "duration": 5622392663,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDefinition.filterWithBuyitNow()"
});
formatter.result({
  "duration": 2340636635,
  "status": "passed"
});
formatter.after({
  "duration": 114173554,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search and verify results",
  "description": "",
  "id": "search-results.-where-one-can-sort,-filter-and-see-details-of-resulting-products.;search-and-verify-results;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@001"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am a non-registered customer And I navigate to www.ebay.co.uk in browser \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for an item \"Mobiles\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I get a list of matching results for item \"Mobiles\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Resulting items cards show: postage price, No of bids, price or show BuyItNow tag",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I can sort the results by Lowest Price And the results are listed in the page in the correct order",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I can sort the results by Highest Price And the results are listed in the page in the correct order",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I can filter the results by \u0027Buy it now\u0027 And all the results shown in the page have the \u0027Buy it now\u0027 tag",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 76
    }
  ],
  "location": "ResultStepDefinition.navigateToEbayWebsite(String)"
});
formatter.result({
  "duration": 2057735444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobiles",
      "offset": 22
    }
  ],
  "location": "ResultStepDefinition.searchForItem(String)"
});
formatter.result({
  "duration": 5870475169,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobiles",
      "offset": 43
    }
  ],
  "location": "ResultStepDefinition.listMatchingResults(String)"
});
formatter.result({
  "duration": 180347704,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDefinition.verifyTagsAndLabels()"
});
formatter.result({
  "duration": 103451,
  "status": "passed"
});
formatter.match({
  "location": "ResultStepDefinition.sortWithLowestPrice()"
});
formatter.result({
  "duration": 140302376,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not interactable\n  (Session info: chrome\u003d77.0.3865.90)\n  (Driver info: chromedriver\u003d76.0.3809.12 (220b19a666554bdcac56dff9ffd44c300842c933-refs/branch-heads/3809@{#83}),platform\u003dMac OS X 10.14.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 14 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027mbp1701.local\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:53722}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d76.0.3809.12 (220b19a666554bdcac56dff9ffd44c300842c933-refs/branch-heads/3809@{#83}), userDataDir\u003d/var/folders/bx/qs79czkd7m74l9j840w30nxc0000gp/T/.com.google.Chrome.5MJpHV}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d77.0.3865.90, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: c1f0b8d516c0b2c35f8ac1bf3522ea44\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat ebay.qa.stepdefinitions.ResultStepDefinition.sortWithLowestPrice(ResultStepDefinition.java:84)\n\tat ✽.Then I can sort the results by Lowest Price And the results are listed in the page in the correct order(EbaySearchResults.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "ResultStepDefinition.sortWithHighestPrice()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ResultStepDefinition.filterWithBuyitNow()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 123021997,
  "status": "passed"
});
});