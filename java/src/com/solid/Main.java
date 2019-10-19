package com.solid;

import com.solid.lsp.ApplyingLSP;
import com.solid.ocp.applying.ApplyingOCP;
import com.solid.srp.applying.ApplyingSRP;

public class Main {

    public static void main(String[] args) {
        ApplyingSRP.run();
        ApplyingOCP.run();
        ApplyingLSP.run();

    }
}
