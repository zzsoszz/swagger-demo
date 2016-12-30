# SwaggerPetstore.PetApi

All URIs are relative to *http://petstore.swagger.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPet**](PetApi.md#addPet) | **POST** /pets | Add a new pet to the store
[**deletePet**](PetApi.md#deletePet) | **DELETE** /pets/{petId} | Deletes a pet
[**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** /pets/findByStatus | Finds Pets by status
[**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** /pets/findByTags | Finds Pets by tags
[**getPetById**](PetApi.md#getPetById) | **GET** /pets/{petId} | Find pet by ID
[**updatePet**](PetApi.md#updatePet) | **PUT** /pets | Update an existing pet
[**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** /pets/{petId} | Updates a pet in the store with form data


<a name="addPet"></a>
# **addPet**
> addPet(opts)

Add a new pet to the store



### Example
```javascript
var SwaggerPetstore = require('swagger_petstore');
var defaultClient = SwaggerPetstore.ApiClient.default;

// Configure OAuth2 access token for authorization: petstore_auth
var petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SwaggerPetstore.PetApi();

var opts = { 
  'body': new SwaggerPetstore.Pet() // Pet | Pet object that needs to be added to the store
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.addPet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | [optional] 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="deletePet"></a>
# **deletePet**
> deletePet(apiKey, petId)

Deletes a pet



### Example
```javascript
var SwaggerPetstore = require('swagger_petstore');
var defaultClient = SwaggerPetstore.ApiClient.default;

// Configure OAuth2 access token for authorization: petstore_auth
var petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SwaggerPetstore.PetApi();

var apiKey = "apiKey_example"; // String | 

var petId = 789; // Number | Pet id to delete


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePet(apiKey, petId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  | 
 **petId** | **Number**| Pet id to delete | 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="findPetsByStatus"></a>
# **findPetsByStatus**
> [Pet] findPetsByStatus(opts)

Finds Pets by status

Multiple status values can be provided with comma seperated strings

### Example
```javascript
var SwaggerPetstore = require('swagger_petstore');
var defaultClient = SwaggerPetstore.ApiClient.default;

// Configure OAuth2 access token for authorization: petstore_auth
var petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SwaggerPetstore.PetApi();

var opts = { 
  'status': ["status_example"] // [String] | Status values that need to be considered for filter
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findPetsByStatus(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**[String]**](String.md)| Status values that need to be considered for filter | [optional] 

### Return type

[**[Pet]**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="findPetsByTags"></a>
# **findPetsByTags**
> [Pet] findPetsByTags(opts)

Finds Pets by tags

Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.

### Example
```javascript
var SwaggerPetstore = require('swagger_petstore');
var defaultClient = SwaggerPetstore.ApiClient.default;

// Configure OAuth2 access token for authorization: petstore_auth
var petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SwaggerPetstore.PetApi();

var opts = { 
  'tags': ["tags_example"] // [String] | Tags to filter by
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findPetsByTags(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**[String]**](String.md)| Tags to filter by | [optional] 

### Return type

[**[Pet]**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getPetById"></a>
# **getPetById**
> Pet getPetById(petId)

Find pet by ID

Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions

### Example
```javascript
var SwaggerPetstore = require('swagger_petstore');
var defaultClient = SwaggerPetstore.ApiClient.default;

// Configure OAuth2 access token for authorization: petstore_auth
var petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

// Configure API key authorization: api_key
var api_key = defaultClient.authentications['api_key'];
api_key.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.apiKeyPrefix = 'Token';

var apiInstance = new SwaggerPetstore.PetApi();

var petId = 789; // Number | ID of pet that needs to be fetched


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPetById(petId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **Number**| ID of pet that needs to be fetched | 

### Return type

[**Pet**](Pet.md)

### Authorization

[petstore_auth](../README.md#petstore_auth), [api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updatePet"></a>
# **updatePet**
> updatePet(opts)

Update an existing pet



### Example
```javascript
var SwaggerPetstore = require('swagger_petstore');
var defaultClient = SwaggerPetstore.ApiClient.default;

// Configure OAuth2 access token for authorization: petstore_auth
var petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SwaggerPetstore.PetApi();

var opts = { 
  'body': new SwaggerPetstore.Pet() // Pet | Pet object that needs to be added to the store
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updatePet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | [optional] 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="updatePetWithForm"></a>
# **updatePetWithForm**
> updatePetWithForm(petId, name, status)

Updates a pet in the store with form data



### Example
```javascript
var SwaggerPetstore = require('swagger_petstore');
var defaultClient = SwaggerPetstore.ApiClient.default;

// Configure OAuth2 access token for authorization: petstore_auth
var petstore_auth = defaultClient.authentications['petstore_auth'];
petstore_auth.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new SwaggerPetstore.PetApi();

var petId = "petId_example"; // String | ID of pet that needs to be updated

var name = "name_example"; // String | Updated name of the pet

var status = "status_example"; // String | Updated status of the pet


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.updatePetWithForm(petId, name, status, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **petId** | **String**| ID of pet that needs to be updated | 
 **name** | **String**| Updated name of the pet | 
 **status** | **String**| Updated status of the pet | 

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

