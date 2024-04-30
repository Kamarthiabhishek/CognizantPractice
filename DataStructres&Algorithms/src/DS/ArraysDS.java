 List<Integer> rotatedArr = new ArrayList<>(arr.size());

    // Calculate the effective rotation amount
    int rotationAmount = d % arr.size();

    // Copy the elements that come after the rotation point to the new array
    for (int i = rotationAmount; i < arr.size(); i++) {
        rotatedArr.add(arr.get(i));
    }

    // Copy the elements that come before the rotation point to the new array
    for (int i = 0; i < rotationAmount; i++) {
        rotatedArr.add(arr.get(i));
    }

    return rotatedArr;