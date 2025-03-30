package School_excercise_dulich;

import java.util.ArrayList;
import java.util.List;

public class TravelPackageManager {
    private List<TravelPacket> packages;

    public TravelPackageManager() {
        packages = new ArrayList<>();
    }

    // Thêm một gói du lịch vào danh sách
    public void addPackage(TravelPacket travelPackage) {
        packages.add(travelPackage);
        System.out.println("Added package: " + travelPackage.name);
    }

    // Xóa một gói du lịch khỏi danh sách dựa trên tên
    public void removePackage(String packageName) {
        boolean removed = packages.removeIf(p -> p.name.equalsIgnoreCase(packageName));
        if (removed) {
            System.out.println("Removed package: " + packageName);
        } else {
            System.out.println("Package not found: " + packageName);
        }
    }

    // Tìm kiếm gói du lịch theo tên
    public TravelPacket findPackage(String packageName) {
        for (TravelPacket travelPackage : packages) {
            if (travelPackage.name.equalsIgnoreCase(packageName)) {
                return travelPackage;
            }
        }
        System.out.println("Package not found: " + packageName);
        return null;
    }

    // Hiển thị danh sách tất cả các gói du lịch
    public void displayAllPackages() {
        if (packages.isEmpty()) {
            System.out.println("No travel packages available.");
        } else {
            System.out.println("List of Travel Packages:");
            for (TravelPacket travelPackage : packages) {
                travelPackage.display();
                System.out.println("---------------------------");
            }
        }
    }
}
