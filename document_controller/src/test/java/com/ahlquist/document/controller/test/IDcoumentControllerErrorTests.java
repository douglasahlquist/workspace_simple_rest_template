package com.ahlquist.document.controller.test;

public interface IDcoumentControllerErrorTests {
	
	/**
	 * A document can be queried by sending a GET request to /storage/documents/{docId}, 
	 * where {docId} is the document ID issued during creation. The content of the GET 
	 * response is the document exactly as it was created or last updated. On success, 
	 * a 200 OK response is sent. A 404 Not Found HTTP response is returned if the 
	 * document ID is invalid.
	 */
	void getInvalidDocument404();
	
	
	/**
	 * A document can be created by sending a POST request with document contents 
	 * to /storage/documents. The document is simply the HTTP request payload. 
	 * All content types are supported. The content of the POST response is a 
	 * unique alphanumeric document ID with a length of 20 characters. 
	 * The HTTP response has a 201 Created status code.
	 */
	void createWithNoBody403();  
	
	
	/*
	 * A document can be updated by sending a PUT request with document contents 
	 * to /storage/documents/{docId}, where {docId} is the document ID issued 
	 * during creation. The document is simply the HTTP request payload. On success, 
	 * a 204 No Content response is sent. A 404 Not Found HTTP response 
	 * is returned if the document ID is invalid.
	 */
    void updateInvalidDcoment404();
    
    /**
     * A document can be deleted by sending a DELETE request with no content 
     * to /storage/documents/{docId}, where {docId} is the document ID issued 
     * during creation. On success, a 204 No Content HTTP response is sent. 
     * A 404 Not Found HTTP response is returned if the document ID is invalid.
     */
    void deleteInvalidDocument404();
}
