public interface RoutingProtocolManagementServiceUserInterface {

    public void distanceTableIndication(short nodeIdentifier, int[][] distanceTable);
    public void linkCostIndication(short nodeIdentifierA, short nodeIdentifierB, int linkValue);
}