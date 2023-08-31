'use strict';

var utils = require('../utils/writer.js');
var Cloud = require('../service/CloudService');

module.exports.cancelCloudById = function cancelCloudById (req, res, next, cloud_id) {
  Cloud.cancelCloudById(cloud_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getCloudOrder = function getCloudOrder (req, res, next, cloud_id) {
  Cloud.getCloudOrder(cloud_id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
