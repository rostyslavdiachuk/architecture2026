package ua.edu.chnu;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Runs every sample's demo back to back. Handy for a pre-lecture sanity check
 * and for diffing the whole console narrative between the {@code bad} and
 * {@code good} branches.
 *
 * <pre>
 *   mvn -q compile exec:java -Dexec.mainClass=ua.edu.chnu.AllDemos
 * </pre>
 *
 * Each demo runs inside a guard so that one blowing up does not stop the rest.
 */
public final class AllDemos {

    private AllDemos() {
    }

    private static final Map<String, List<Consumer<String[]>>> DEMOS = Map.of(
            "SOLID", List.of(
                    ua.edu.chnu.solid.srp.SrpDemo::main,
                    ua.edu.chnu.solid.ocp.OcpDemo::main,
                    ua.edu.chnu.solid.lsp.LspDemo::main,
                    ua.edu.chnu.solid.isp.IspDemo::main,
                    ua.edu.chnu.solid.dip.DipDemo::main),
            "GRASP", List.of(
                    ua.edu.chnu.grasp.informationexpert.InformationExpertDemo::main,
                    ua.edu.chnu.grasp.creator.CreatorDemo::main,
                    ua.edu.chnu.grasp.controller.ControllerDemo::main,
                    ua.edu.chnu.grasp.lowcoupling.LowCouplingDemo::main,
                    ua.edu.chnu.grasp.highcohesion.HighCohesionDemo::main,
                    ua.edu.chnu.grasp.polymorphism.PolymorphismDemo::main,
                    ua.edu.chnu.grasp.purefabrication.PureFabricationDemo::main,
                    ua.edu.chnu.grasp.indirection.IndirectionDemo::main,
                    ua.edu.chnu.grasp.protectedvariations.ProtectedVariationsDemo::main));

    public static void main(String[] args) {
        for (String group : List.of("SOLID", "GRASP")) {
            System.out.println();
            System.out.println("############  " + group + "  ############");
            for (Consumer<String[]> demo : DEMOS.get(group)) {
                try {
                    demo.accept(args);
                } catch (RuntimeException e) {
                    System.out.println("!! demo threw " + e.getClass().getSimpleName() + ": " + e.getMessage());
                }
            }
        }
    }
}
