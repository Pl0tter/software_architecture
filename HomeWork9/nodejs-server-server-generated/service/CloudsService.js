'use strict';


/**
 * Создание заказа на облако
 *
 * body Error  (optional)
 * returns Clouds
 **/
exports.createCloud = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "OS" : "Windows",
  "id_client" : "f102b615",
  "CPU" : "8",
  "cloud_id" : "f102b615",
  "RAM" : "128"
}, {
  "OS" : "Windows",
  "id_client" : "f102b615",
  "CPU" : "8",
  "cloud_id" : "f102b615",
  "RAM" : "128"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Метод получения списка ресурсов на облако
 *
 * returns Clouds
 **/
exports.getAllClouds = function() {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "OS" : "Windows",
  "id_client" : "f102b615",
  "CPU" : "8",
  "cloud_id" : "f102b615",
  "RAM" : "128"
}, {
  "OS" : "Windows",
  "id_client" : "f102b615",
  "CPU" : "8",
  "cloud_id" : "f102b615",
  "RAM" : "128"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

