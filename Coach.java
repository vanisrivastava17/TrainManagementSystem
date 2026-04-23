class Coach {
    String coachId;
    String type;
    int capacity;

    Coach(String coachId, String type, int capacity) {
        this.coachId = coachId;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return coachId + " (" + type + ", Cap: " + capacity + ")";
    }
}
