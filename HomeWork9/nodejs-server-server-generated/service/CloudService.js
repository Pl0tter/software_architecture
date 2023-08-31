'use strict';


/**
 * Метод отмены заказа на облако по ID
 *
 * cloud_id String Идентификатор заказа облака
 * no response value expected for this operation
 **/
exports.cancelCloudById = function(cloud_id) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Метод получения информации о заказе ресурсов на облаке по ID
 *
 * cloud_id String Идентификатор заказа облака
 * returns Cloud
 **/
exports.getCloudOrder = function(cloud_id) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "OS" : "Windows",
  "id_client" : "f102b615",
  "CPU" : "8",
  "cloud_id" : "f102b615",
  "RAM" : "128"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

