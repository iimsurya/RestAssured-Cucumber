package contracts;

public enum APIResources {

    getPlaceResource("/maps/api/place/get/json"),
    addPlaceResource("/maps/api/place/add/json"),
    deletePlaceResource("/maps/api/place/delete/json");


    private final String resource;

     APIResources (String resource){
        this.resource=resource;
    }

    public String getResource(){
         return resource;
    }
}

/*
 * APIResources
 * -------------
 * Enum used to centralize API endpoint paths used by the tests. Use
 * APIResources.valueOf("addPlaceResource").getResource() to obtain the
 * resource path for a request. Centralizing endpoints here reduces
 * duplication and makes it easier to update paths when the API changes.
 */

