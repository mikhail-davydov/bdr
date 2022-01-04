import React from 'react';
import "./Home.css";

class Home extends React.Component {
    render() {
        return (
            <div className="home">
                <header className="header">
                    <div className="header__user">
                        <button className="button" type="button">
                            <div className="user">
                                <img src="#" alt="User" className="user__img"/>
                                <div className="user__fullname">Lorem ipsum.</div>
                            </div>
                        </button>
                    </div>
                    <div className="header__buttons">
                        <button className="button" type="button">
                            Категории
                        </button>
                        <button className="button" type="button">
                            Приход/Расход
                        </button>
                    </div>
                </header>
                <main className="main">
                    <div className="menu">
                        <button className="button" type="button">
                            По периодам/Лист 1
                        </button>
                        <button className="button" type="button">
                            По дням/Лист 2
                        </button>
                        <button className="button" type="button">
                            Аналитика
                        </button>
                        <button className="button" type="button">
                            Рекомендации
                        </button>
                    </div>
                    <div className="content">
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid atque blanditiis consequuntur doloribus error esse excepturi, explicabo facere id in nihil odio officiis omnis provident quam qui quisquam quod totam veniam vitae! Dolorem esse ex expedita molestias repellat. Amet assumenda dicta ipsa molestias odio officiis provident similique totam. Magni nesciunt nisi ullam vel veniam. Ad alias asperiores assumenda culpa deleniti dolorem doloremque dolores, ducimus ea eaque esse eveniet expedita iste labore maxime modi nam nobis officiis placeat quae quam quasi quibusdam quidem quis quisquam tempora tempore ut! Nemo quae reiciendis temporibus. Adipisci excepturi ipsum quae reprehenderit voluptate? Magnam, odio, veniam.
                    </div>
                </main>
                <footer className="footer">
                    <div className="copyright">
                        <img src="#" alt="Copyright" className="copyright__img"/>
                        <div className="copyright__text">
                            Company name
                        </div>
                    </div>
                    <div className="contacts">
                        <a className="phone" href="tel:+7000123456789">+7 000 123456789</a>
                        <a className="email" href="mailto:my@email.com">my@email.com</a>
                        <div className="address">Lorem ipsum dolor sit amet.</div>
                    </div>
                </footer>
            </div>
        );
    }
}

export default Home;