package pojo;

public class ResponseAddPlace {

    private String status;
    private String place_id;
    private String scope;
    private String reference;
    private String id;

    /**
     * POJO used to deserialize the successful Add Place response.
     * Typical response contains status, place_id and scope among other fields.
     */

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




}
