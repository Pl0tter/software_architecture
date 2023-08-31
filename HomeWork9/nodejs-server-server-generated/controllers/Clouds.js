'use strict';

var utils = require('../utils/writer.js');
var Clouds = require('../service/CloudsService');

module.exports.createCloud = function createCloud (req, res, next, body) {
  Clouds.createCloud(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getAllClouds = function getAllClouds (req, res, next) {
  Clouds.getAllClouds()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
