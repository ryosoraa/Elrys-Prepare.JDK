package com.ryo.film.api;

import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

public class JerseyClient {

    ObjectMapper mapper = new ObjectMapper();
    Client client = new Client();

    public JsonNode postRequest(String bodyUrl, String request)
            throws JsonProcessingException, UniformInterfaceException, ClientHandlerException {
        WebResource webResource = client.resource(bodyUrl);
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, request);

        String responds = response.getEntity(String.class);
        return mapper.readValue(responds, JsonNode.class);
    }
}
