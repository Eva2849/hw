package org.itstep.MapLab;

import java.util.*;

public class MapSetTester {
    public static void main(String[] args) {
        Map<String, TreeSet<String>> networkMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String inputShow, inputChannel, input;
        Set<String> allChannels = new TreeSet<>();
        do {
            System.out.print("Input TV network: ");
            inputChannel = scanner.nextLine();
            System.out.print("Input TV show on " + inputChannel + ": ");
            inputShow = scanner.nextLine();
            if (!networkMap.containsKey(inputChannel)) {
                TreeSet<String> tvShows = new TreeSet<>();
                tvShows.add(inputShow);
                allChannels.add(inputChannel);
                networkMap.put(inputChannel, tvShows);
            } else {
                networkMap.get(inputChannel).add(inputShow);
            }
            System.out.println(networkMap);
            System.out.println("Do you want to add another TV show? Please input \"Yes\" or \"No\"");
            input = scanner.nextLine();
        } while (!input.toLowerCase().startsWith("n"));
        String[] channels = new String[allChannels.size()];
        for (int i = 0; i < channels.length; i++) {
            channels[i] = (String) allChannels.toArray()[i];
        }
        for (String singleChannel : channels) {
            System.out.println(singleChannel);
            System.out.println(networkMap.get(singleChannel));
        }
    }
}
