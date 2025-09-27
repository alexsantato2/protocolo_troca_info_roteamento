package interfaces.routingprotocolmanagementinterface;

public interface RoutingProtocolManagementInterface {

    public boolean getDistanceTable(short nodeIdentifier);
    public boolean getLinkCost(short nodeIdentifierA, short nodeIdentifierB);
    public boolean setLinkCost(short nodeIdentifierA, short nodeIdentifierB, int linkValue);
}