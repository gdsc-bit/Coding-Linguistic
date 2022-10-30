const x = tf.tensor1d([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]);
const y = tf.tensor1d([2.5879,3.1153,3.7041,4.6216,5.2307,5.6205,6.9904,7.8416,9.0201,10.5586,12.1638,14.1438,16.5961,19.2497,22.3430]);


const c0 = tf.scalar(2).variable();
const k = tf.scalar(0.10).variable();

// y = c0*e^(k*x)
const fun = (x) => x.mul(k).exp().mul(c0);
const cost = (pred, label) => pred.sub(label).square().mean();

const learning_rate = 0.1;
const optimizer = tf.train.adagrad(learning_rate);

// Train the model.
for (let i = 0; i < 500; i++) {
    optimizer.minimize(() => cost(fun(x), y));
}

console.log(`c0: ${c0.dataSync()}, k: ${k.dataSync()}`);
fun(x).print()

// [2.4752154, 2.899802, 3.3972201, 3.9799631, 4.6626663, 5.4624777, 6.3994851, 7.4972224, 8.7832594, 10.289897, 12.0549774, 14.1228304, 16.545393, 19.3835087, 22.7084637]
