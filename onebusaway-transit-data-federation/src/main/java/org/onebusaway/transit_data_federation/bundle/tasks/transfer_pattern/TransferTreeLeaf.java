package org.onebusaway.transit_data_federation.bundle.tasks.transfer_pattern;

import org.onebusaway.transit_data_federation.services.transit_graph.StopEntry;

public interface TransferTreeLeaf {
  public TransferTree extendTree(StopEntry fromStop, StopEntry toStop);
}