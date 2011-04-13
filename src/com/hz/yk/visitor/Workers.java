package com.hz.yk.visitor;

import java.util.ArrayList;

public class Workers {
	private ArrayList<Element> workerList = new ArrayList<Element>();

	public void attach(Element worker) {
		workerList.add(worker);
	}

	public void detach(Element worker) {
		workerList.remove(worker);
	}

	public void Accept(Visitor visitor) {
		for (Element e : workerList) {
			e.Accept(visitor);
		}
	}
}
