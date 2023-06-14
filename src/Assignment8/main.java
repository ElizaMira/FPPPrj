package Assignment8;

import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<Marketing> MarketingList = new ArrayList<>();
        MarketingList.add(new Marketing("David", "Printer", 2000));
        MarketingList.add(new Marketing("Michael", "Scanner", 1000));
        MarketingList.add(new Marketing("Steven", "Air Con", 3000));

        System.out.println(MarketingList.toString());
        //MarketingList.remove(1);
        System.out.println(MarketingList.size());
        Collections.sort(MarketingList, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing p1, Marketing p2) {
                if (p1.getSalesamount() > p2.getSalesamount()) return 1;
                else if (p1.getSalesamount() < p2.getSalesamount()) return -1;
                else return 0;
            }
        });
        System.out.println(MarketingList);

       List<Marketing> listEmp= listMoreThan1000(MarketingList);
        System.out.println(listEmp);
    }
        static List<Marketing> listMoreThan1000 (List < Marketing > list) {

            Collections.sort(list, new Comparator<Marketing>() {
                @Override
                public int compare(Marketing p1, Marketing p2) {
                    return p1.getEmployeename().compareTo(p2.getEmployeename());
                }

            });
            List<Marketing> listEmp=new ArrayList<>();
            for(Marketing mk:list)
            {
                if(mk.getSalesamount() >1000)
                    listEmp.add(mk);

            }
            return listEmp;
        }
    }





