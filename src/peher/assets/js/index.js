import React from 'react';
import ReactDOM from 'react-dom';
window.React = React;
window.ReactDOM = ReactDOM;

class YoutubePlayer extends React.Component {
  constructor(props) {
    super(props);
    this.state = { list: props.musicList, current_track: 0 };
  }

  render() {
    const track = this.state.list[this.state.current_track]
    return (
      <div>
        <p>{track.title}</p>
        <div data-video={track.id}
             data-autoplay="0"
             data-loop="1"
             id="youtube-audio">
        </div>
      </div>
    );
  }
}

const element = document.getElementById('yt-player');
const musicList = JSON.parse(element.dataset["musicList"])
ReactDOM.render(<YoutubePlayer musicList={musicList}/>, element);
